package me.unisteven.algo.paths;

public class Path implements Comparable<Path>{
    public Vertex vertex;
    public double cost;

    public Path(Vertex vertex, double cost) {
        this.vertex = vertex;
        this.cost = cost;
    }

    @Override
    public int compareTo(Path o) {
        return Double.compare(cost, o.cost);
    }
}
