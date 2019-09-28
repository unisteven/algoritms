package me.unisteven.algo.paths;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

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

    public boolean isConnected(){
        for(Map.Entry<String,Vertex> key: this.vertexMap.entrySet()){
            if(key.getValue().getDist() == Double.POSITIVE_INFINITY){
                return false; // as soon as one of the values is infinite it means the graph is not fully connected.
            }
        }
        return true; // it isn't false so it must be true.
    }

    @Override
    public String toString() {
        return "Graph{" +
                "vertexMap=" + vertexMap +
                '}';
    }
}
