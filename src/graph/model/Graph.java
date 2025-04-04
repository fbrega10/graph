package graph.model;

import graph.inter.GraphInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Graph implements GraphInterface {

    private List<Vertex> vertexes;
    private List<Color> colorList;
    private PriorityQueue<Vertex> grayVertexes;

    public Graph(){
        colorList = new ArrayList<>();
        grayVertexes = new PriorityQueue<>();
    }

    public Graph(ArrayList<Vertex> list){
        this();
        vertexes = list;
        if (list.isEmpty())
            return;
        for (int i = 0; i < list.size(); ++i){
            colorList.add(Color.WHITE);
        }
    }

    public void addVertex(Vertex v){
        this.vertexes.add(v);
        this.colorList.add(Color.WHITE);
    }

    @Override
    public List<Vertex> getVertexes() {
        return this.vertexes;
    }
}
