package me.unisteven.algo.paths;

import java.util.HashMap;
import java.util.Map;

public class Graph {
    private Map<String, Vertex> vertexMap = new HashMap<String, Vertex>();

    /**
     * If vertexName is not present, add it to vertexMap.
     * In either case, return the Vertex.
     */
    public Vertex getVertex(String vertexName) {
        Vertex v = vertexMap.get(vertexName);
        if (v == null) {
            v = new Vertex(vertexName);
            vertexMap.put(vertexName, v);
        }
        return v;
    }

    public Map<String, Vertex> getVertexMap() {
        return vertexMap;
    }

    @Override
    public String toString() {
        return "Graph{" +
                "vertexMap=" + vertexMap +
                '}';
    }
}
