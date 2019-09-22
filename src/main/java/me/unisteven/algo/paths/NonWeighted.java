package me.unisteven.algo.paths;

import me.unisteven.algo.lists.StevensQueue;

import java.util.Map;

public class NonWeighted extends PathAlgorithm {

    private String end;
    private Graph graph;


    @Override
    public boolean solve(Graph graph, String startName, String endName) {
        this.end = endName;
        this.graph = graph;
        Map<String, Vertex> vertexes = graph.getVertexMap();
        Vertex start = vertexes.get(startName);
        if (start == null) {
            return false;
        }
        start.setDist(0);
        StevensQueue<Vertex> queue = new StevensQueue<>();
        queue.enqueue(start);
        while (!queue.isEmpty()) {
            Vertex found = queue.dequeue();
            Edge edge;
            for (int i = 0; i < found.getAdj().size(); i++) {
                edge = found.getAdj().get(i);
                Vertex w = edge.getDest();
                if (w.getDist() == Double.POSITIVE_INFINITY) {
                    w.setDist(found.getDist() + 1);
                    w.setPrev(found);
                    queue.enqueue(w);
                }
            }
        }
        return true;
    }


    @Override
    public String toString() {
        return super.createPathString(graph, this.end);
    }
}
