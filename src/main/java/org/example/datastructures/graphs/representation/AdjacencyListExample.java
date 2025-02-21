package org.example.datastructures.graphs.representation;


import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;

/**
 * *
 * * @author Pratyay
 */


class Vertex {
    // for now, we are sticking to int data
    @Getter
    private int data;
    @Getter
    private List<Vertex> connectedVertices;

    public Vertex(int data) {
        this.data = data;
        connectedVertices = new ArrayList<>();
    }

    public void connect(Vertex vertex) {
        connectedVertices.add(vertex);
    }

    public void connect(List<Vertex> vertices) {
        connectedVertices.addAll(vertices);
    }

}

@RequiredArgsConstructor
class AdjacencyList {
    @Getter
    private final List<Vertex> vertices;
}

class AdjacencyListExample {
    public static void main(String[] args) {
        Vertex v1 = new Vertex(10);
        Vertex v2 = new Vertex(20);
        Vertex v3 = new Vertex(30);
        Vertex v4 = new Vertex(50);

        v1.connect(v2);
        v2.connect(v3);
        v4.connect(List.of(v2,v3));

        AdjacencyList adjacencyList = new AdjacencyList(List.of(v1, v2, v3, v4));
        adjacencyList.getVertices();
        System.out.println("basic graph adjacency list example");
    }
}
