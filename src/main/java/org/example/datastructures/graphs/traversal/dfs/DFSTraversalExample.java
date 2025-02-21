package org.example.datastructures.graphs.traversal.dfs;


import lombok.RequiredArgsConstructor;
import org.example.datastructures.graphs.Vertex;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

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
        Vertex v1 = new Vertex(10);
        Vertex v2 = new Vertex(20);
        Vertex v3 = new Vertex(30);
        Vertex v4 = new Vertex(50);

        v1.connect(v2);
        v2.connect(v3);
        v4.connect(List.of(v2,v3));
        DFSTraversal dfsTraversal = new DFSTraversal();
        Queue queue = new LinkedList();
        dfsTraversal.traverse(List.of(v1, v2, v3, v4), queue);
        System.out.println("debug!");
    }
}

@RequiredArgsConstructor
class DFSTraversal {
    public void traverse(List<Vertex> vertices, Queue queue) {
        for(Vertex vertex: vertices) {
            queue.add(vertex.getData());
            if(!vertex.getConnectedVertices().isEmpty()){
                traverse(vertex.getConnectedVertices(), queue);
            }
        }
    }
}
