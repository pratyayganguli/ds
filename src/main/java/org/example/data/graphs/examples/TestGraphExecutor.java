package org.example.data.graphs.examples;


import java.util.Hashtable;
import java.util.List;
import java.util.Map;

/**
 *
 * Adjacency list example
 *
 * @author Pratyay
 */


class Graph {
    private Map<Vertex, List<Vertex>> data;

    Graph(Map data) {
        this.data = data;
    }

    public Map<Vertex, List<Vertex>> getData() {
        return data;
    }

    public void setData(Map<Vertex, List<Vertex>> data) {
        this.data = data;
    }
}

class Vertex {
    int data;
    Vertex(int data) {
        this.data = data;
    }
}


class TestGraphExecutor {
    public static void main(String[] args) {
        var v1 = new Vertex(10);
        var v2 = new Vertex(20);
        var v3 = new Vertex(30);
        var v4 = new Vertex(40);

        var data = new Hashtable<Vertex, List<Vertex>>();
        data.put(v1, List.of(v2, v3));
        data.put(v2, List.of(v3));
        data.put(v3, List.of(v2, v3));
        data.put(v4, null);
    }
}
