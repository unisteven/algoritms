package me.unisteven.algo.paths;

import java.util.PriorityQueue;

public class Dijkstra extends PathAlgorithm {

    private String end;
    private Graph graph;


    @Override
    public boolean solve(Graph graph, String startName, String endName) {
        this.end = endName;
        this.graph = graph;
        PriorityQueue priorityQueue = new PriorityQueue();
        Vertex start = graph.getVertex(startName);
        if (start == null) {
            return false;
        }
        start.setDist(0);
        priorityQueue.add(new Path(start, 0));

        int nodeSeen = 0;
        while (!priorityQueue.isEmpty() && nodeSeen < graph.getVertexMap().size()) {
            Path p = (Path) priorityQueue.poll();
            Vertex v = p.vertex;
            if (v.isSeen()) {
                continue;
            }
            v.setSeen(true);
            nodeSeen++;

            Edge edge;
            for (int i = 0; i < v.getAdj().size(); i++) {
                edge = v.getAdj().get(i);
                Vertex w = edge.getDest();
                double cost = edge.getCost();
                if (cost < 0) {
                    return false; // error
                }
                if (w.getDist() > v.getDist() + cost) {
                    w.setDist(v.getDist() + cost);
                    w.setPrev(v);
                    priorityQueue.add(new Path(w, w.getDist()));
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
