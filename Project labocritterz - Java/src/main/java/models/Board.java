package models;

import java.util.ArrayList;

public class Board {
    ArrayList<Place> placement;

    public Board(ArrayList<Place> placement){
        this.placement = placement;
    }

    public Place getPlacementIndex(int index) {
        return placement.get(index);
    }
}
