package io.cloudneutral.shortestpath.algorithm;

import io.cloudneutral.shortestpath.Node;

public class EmptyFringeListener<T> implements FringeListener<T> {
    @Override
    public long simulationDelay() {
        return 0;
    }

    @Override
    public void nodeVisited(Node<T> node) {

    }

    @Override
    public void nodeClosed(Node<T> node) {

    }
}
