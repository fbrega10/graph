package graph;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Graph {

    private List<Vertex> vertexes;
    private List<Color> colorList;
    private List<Vertex> ancestorList;
    private PriorityQueue<Vertex> grayVertexes;

    public Graph(){
        colorList = new ArrayList<>();
        ancestorList = new ArrayList<>();
        grayVertexes = new PriorityQueue<>();
    }

    public Graph(ArrayList<Vertex> list){
        this();
        vertexes = list;
        if (list.isEmpty())
            return;
        colorList.add(Color.WHITE);
        ancestorList.add(null);
        for (int i = 1; i < list.size(); ++i){
            colorList.add(Color.WHITE);
            ancestorList.add(vertexes.get(i));
        }
    }
}
