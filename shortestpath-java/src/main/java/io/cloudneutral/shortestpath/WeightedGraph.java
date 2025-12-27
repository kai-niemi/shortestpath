package io.cloudneutral.shortestpath;

import io.cloudneutral.shortestpath.algorithm.AStarAlgorithm;
import io.cloudneutral.shortestpath.algorithm.BellmanFordAlgorithm;
import io.cloudneutral.shortestpath.algorithm.DijkstrasAlgorithm;
import io.cloudneutral.shortestpath.algorithm.SearchAlgorithm;

public class WeightedGraph<N> extends Graph<N, Double> {
    public WeightedGraph() {
    }

    private TraversableGraph<N> traversableGraph() {
        return new TraversableGraph<>(this);
    }

    public SearchAlgorithm<N> dijkstrasAlgorithm() {
        return new DijkstrasAlgorithm<>(traversableGraph());
    }

    public SearchAlgorithm<N> aStarAlgorithm(HeuristicCost<N> heuristics) {
        return new AStarAlgorithm<>(traversableGraph(), heuristics);
    }

    public SearchAlgorithm<N> bellmanFordAlgorithm() {
        return new BellmanFordAlgorithm<>(traversableGraph());
    }
}
