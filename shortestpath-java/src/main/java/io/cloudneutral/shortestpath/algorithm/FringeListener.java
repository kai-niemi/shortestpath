package io.cloudneutral.shortestpath.algorithm;

import io.cloudneutral.shortestpath.Node;

public interface FringeListener<N> {
    long simulationDelay();

    void nodeVisited(Node<N> node);

    void nodeClosed(Node<N> node);
}
