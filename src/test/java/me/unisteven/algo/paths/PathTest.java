package me.unisteven.algo.paths;

import me.unisteven.algo.lists.HanLinkedList;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PathTest {

    Graph graph;
    PathAlgorithm pathAlgorithm;

    @Before
    public void setUp() throws Exception {
        graph = new Graph();

        // create graph
        Vertex v1 = this.graph.getVertex("point1");
        Vertex v2 = this.graph.getVertex("point2");
        Vertex v3 = this.graph.getVertex("point3");
        Vertex v4 = this.graph.getVertex("point4");
        Vertex v5 = this.graph.getVertex("point5");
        Vertex v6 = this.graph.getVertex("point6");

        // vertex 1
        HanLinkedList<Edge> v1Edges = new HanLinkedList<>();
        v1Edges.addIem(new Edge(v2, 1));
        v1Edges.addIem(new Edge(v6, 9));
        v1.setAdj(v1Edges);
        //vertex 2
        HanLinkedList<Edge> v2Edges = new HanLinkedList<>();
        v2Edges.addIem(new Edge(v3, 3));
        v2.setAdj(v2Edges);
        //vertex 3
        // no edges
        //vertex 4
        // no edges
        //vertex 5
        HanLinkedList<Edge> v5Edges = new HanLinkedList<>();
        v5Edges.addIem(new Edge(v1, 4));
        v5.setAdj(v5Edges);
        //vertex 6
        HanLinkedList<Edge> v6Edges = new HanLinkedList<>();
        v6Edges.addIem(new Edge(v3, 2));
        v6Edges.addIem(new Edge(v4, 8));
        v6Edges.addIem(new Edge(v5, 3));
        v6.setAdj(v6Edges);
    }

    @Test
    public void nonWeightedPath() {
        this.pathAlgorithm = new NonWeighted();
        this.pathAlgorithm.solve(this.graph, "point1", "point3");
        String path = this.pathAlgorithm.toString();
        Assert.assertEquals("point3 => point2 => point1 => ", path);// it is reversed.
    }

    @Test
    public void weightedPath() {
        this.pathAlgorithm = new Dijkstra();
        this.pathAlgorithm.solve(this.graph, "point1", "point5");
        System.out.println(graph);
        String path = this.pathAlgorithm.toString();
        Assert.assertEquals("point2 => ", path); // it is reversed
    }


}
