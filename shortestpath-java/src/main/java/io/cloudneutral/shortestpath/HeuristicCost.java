package io.cloudneutral.shortestpath;

public interface HeuristicCost<N> {
    double estimateCost(N node, N goal);
}
