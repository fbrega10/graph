package graph;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Vertex<T> implements Serializable {

    private T content;
    private List<Vertex> adjacentList;

    public Vertex(T t){
       this.content = t ;
       this.adjacentList = new ArrayList<>();
    }
    public boolean addAdjacent(Vertex v){
        if (!this.adjacentList.contains(v)){
            this.adjacentList.add(v);
            return true;
        }
        return false;
    }

    public boolean removeAdjacent(Vertex v){
        if (this.adjacentList.contains(v)){
            this.adjacentList.remove(v);
            return true;
        }
        return false;
    }

}
