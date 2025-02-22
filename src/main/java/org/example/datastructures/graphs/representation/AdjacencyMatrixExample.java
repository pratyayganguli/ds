package org.example.datastructures.graphs.representation;


import lombok.RequiredArgsConstructor;
import org.example.datastructures.graphs.Vertex;

import java.util.List;

/**
**
 * Considering a directed graph we are preparing the adjacency matrix
** @author Pratyay
*/
class AdjacencyMatrixExample {
    public static void main(String[] args) {
        Vertex v1 = new Vertex(10);
        Vertex v2 = new Vertex(20);
        Vertex v3 = new Vertex(30);
        Vertex v4 = new Vertex(50);

        v1.connect(v2);
        v2.connect(v3);
        v4.connect(List.of(v2,v3));
        AdjacencyMatrix adjacencyMatrix = new AdjacencyMatrix(List.of(v1, v2, v3, v4));
        adjacencyMatrix.transformIntoMatrix();
    }
}

@RequiredArgsConstructor
class AdjacencyMatrix {
    private final List<Vertex> vertices;

    public void transformIntoMatrix() {
        int [][] arr = new int[vertices.size()][vertices.size()];
        int [][] data = new int[vertices.size()][vertices.size()];
        data = populate(data, vertices);
        for(int i = 0; i < vertices.size(); i++) {
            int j = 0;
            int connectedCount = 0;
            while(connectedCount < vertices.get(i).getConnectedVertices().size()) {
                if(data[i][j] == vertices.get(i).getConnectedVertices().get(connectedCount).getData()) {
                    arr[i][j] = 1;
                    connectedCount++;
                }
                System.out.print(arr[i][j]);
                j++;
            }
            System.out.println();
        }
    }

    private int[][] populate(int [][] data, List<Vertex> vertices) {
        for(int i = 0; i < vertices.size(); i++) {
            for(int j = 0; j < vertices.size(); j++) {
                data[i][j] = vertices.get(j).getData();
            }
        }
        return data;
    }
}
