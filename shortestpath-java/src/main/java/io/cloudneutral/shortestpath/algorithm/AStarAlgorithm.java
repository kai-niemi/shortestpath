package io.cloudneutral.shortestpath.algorithm;

import io.cloudneutral.shortestpath.HeuristicCost;
import io.cloudneutral.shortestpath.Node;
import io.cloudneutral.shortestpath.TraversableGraph;

public class AStarAlgorithm<N> extends DijkstrasAlgorithm<N> {
    private final HeuristicCost<N> heuristicCost;

    public AStarAlgorithm(TraversableGraph<N> graph, HeuristicCost<N> heuristicCost) {
        super(graph);
        this.heuristicCost = heuristicCost;
    }

    @Override
    protected double heuristicCostEstimate(Node<N> from, Node<N> goal) {
        return heuristicCost.estimateCost(from.getValue(), goal.getValue());
    }
}
