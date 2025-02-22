package org.example.datastructures.graphs.traversal.dfs;


import lombok.RequiredArgsConstructor;
import org.example.datastructures.graphs.Vertex;

import java.util.ArrayList;
import java.util.List;


/**
 * *
 *
 *              4
 *             /  \
 *            3    1
 *           / \    \
 *          11  10   6
 *                   /\
 *                  9  7
 *
 *  4, 3, 11, 10, 1, 6, 9, 7
 *
 * @author Pratyay
 */

class DFSTraversalExample {
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

        DFSTraversal dfsTraversal = new DFSTraversal();
        List<Integer> list = new ArrayList<>();
        dfsTraversal.traverse(List.of(v1, v2, v3, v4, v5, v6, v7, v8), list);
        System.out.println("debug!");
        System.out.println(list);
    }
}

@RequiredArgsConstructor
class DFSTraversal {
    public void traverse(List<Vertex> vertices, List list) {
        for(Vertex vertex: vertices) {
            if(!list.contains(vertex.getData())) {
                list.add(vertex.getData());
            }
            if(!vertex.getConnectedVertices().isEmpty()){
                traverse(vertex.getConnectedVertices(), list);
            }
        }
    }
}
