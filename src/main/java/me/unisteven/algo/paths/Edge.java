package me.unisteven.algo.paths;

public class Edge {
    private Vertex dest; // Second vertex in edge
    private double cost;

    public Edge(Vertex dest, double cost) {
        this.dest = dest;
        this.cost = cost;
    }

    public Vertex getDest() {
        return dest;
    }

    public void setDest(Vertex dest) {
        this.dest = dest;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}
