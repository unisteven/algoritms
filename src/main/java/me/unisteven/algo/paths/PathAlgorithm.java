package me.unisteven.algo.paths;

public abstract class PathAlgorithm {
    abstract boolean solve(Graph graph, String startName, String endName);

    String createPathString(Graph graph, String end) {
        Vertex v = graph.getVertex(end);
        StringBuilder path = new StringBuilder(v.getName() + " => ");
        while (v.getPrev() != null) {
            v = v.getPrev();
            path.append(v.getName()).append(" => ");
        }
        return path.toString();
    }
}
