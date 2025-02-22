package org.example.datastructures.graphs;


import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.List;

/**
 * *
 * * @author Pratyay
 */

@RequiredArgsConstructor
public class AdjacencyList {
    @Getter
    private final List<Vertex> vertices;
}
