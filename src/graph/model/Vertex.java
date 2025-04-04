package graph.model;

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
        if (v == null)
            return false;
        return this.adjacentList.add(v);
    }

    public boolean removeAdjacent(Vertex v){
        if (v == null)
            return false;
        return this.adjacentList.remove(v);
    }

    public List<Vertex> getAdjacents(){
        return this.adjacentList;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
