package org.example.datastructures.graphs;


import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

/**
 * *
 * * @author Pratyay
 */
public class Vertex {
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