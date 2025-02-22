package org.example.datastructures.graphs.traversal.bfs;


import org.example.datastructures.graphs.Vertex;

import java.util.ArrayList;
import java.util.List;

/**
 * *
 *
 *          1
 *         / \
 *        2   3
 *       /  \  \
 *      7    9  6
 *             / \
 *            5   8
 *
 * BFS: 1, 2, 3, 7, 9, 6, 5, 8
 */
class BFSTraversalExample {
    public static void main(String[] args) {
        Vertex v1 = new Vertex(1);
        Vertex v2 = new Vertex(2);
        Vertex v3 = new Vertex(3);
        Vertex v4 = new Vertex(7);
        Vertex v5 = new Vertex(9);
        Vertex v6 = new Vertex(6);
        Vertex v7 = new Vertex(5);
        Vertex v8 = new Vertex(8);

        v1.connect(List.of(v2, v3));
        v2.connect(List.of(v4, v5));
        v3.connect(v6);
        v6.connect(List.of(v7, v8));
        BFSTraversal bfsTraversal = new BFSTraversal();
        List<Integer> list = new ArrayList<>();
        bfsTraversal.traverse(List.of(v1, v2, v3, v4, v5, v6, v7, v8), list);
        System.out.println("debug!");
    }
}

class BFSTraversal {
    void traverse(List<Vertex> vertices, List list) {
        for(Vertex vertex: vertices) {
            if(!list.contains(vertex.getData())) {
                list.add(vertex.getData());
            }
            if(!vertex.getConnectedVertices().isEmpty()) {
                if(!list.contains(vertex.getData())) {
                    list.add(vertex.getData());
                }
            }
        }
    }
}
