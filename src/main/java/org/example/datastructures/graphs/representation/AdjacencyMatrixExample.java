package org.example.datastructures.graphs.representation;


import lombok.RequiredArgsConstructor;

import java.util.Arrays;
import java.util.List;

/**
 * *
 * * @author Pratyay
 */

@RequiredArgsConstructor
class AdjacencyMatrix {
    private final List<Vertex> vertices;

    public void display() {
        int numberOfVertices = vertices.size();
        int[][] arr = new int[numberOfVertices][numberOfVertices];

        for(int i = 0; i < numberOfVertices; i++) {
            List<Vertex> connectedVertices =  vertices.get(i).getConnectedVertices();
            for(int j = 0; j < connectedVertices.size(); j++) {
                if(vertices.get(i).getData() != connectedVertices.get(j).getData()) {
                    arr[i][j] = 1;
                }
            }
        }
        System.out.println("debug!");
    }
}

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
        adjacencyMatrix.display();
    }
}
