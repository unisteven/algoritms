package me.unisteven.algo.paths;

import me.unisteven.algo.lists.HanLinkedList;

public class Vertex {
    private String name;
    private HanLinkedList<Edge> adj; // Adjacent edges
    private boolean seen = false;

    // The following attributes are needed for the algorithm
    private double dist; // Cost
    private Vertex prev; // Previous vertex on shortest path

    public Vertex(String name) {
        this.name = name;
        this.adj = new HanLinkedList<>();

        this.prev = null;
        this.dist = Double.POSITIVE_INFINITY;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HanLinkedList<Edge> getAdj() {
        return adj;
    }

    public void setAdj(HanLinkedList<Edge> adj) {
        this.adj = adj;
    }

    public double getDist() {
        return dist;
    }

    public void setDist(double dist) {
        this.dist = dist;
    }

    public Vertex getPrev() {
        return prev;
    }

    public void setPrev(Vertex prev) {
        this.prev = prev;
    }

    public boolean isSeen() {
        return seen;
    }

    public void setSeen(boolean seen) {
        this.seen = seen;
    }

    @Override
    public String toString() {
        return this.name + " (" + this.dist + ")";
    }
}
