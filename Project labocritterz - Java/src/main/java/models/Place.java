package models;
import com.raylib.Raylib;

public class Place {
    Raylib.Rectangle hitbox;
    int position;
    boolean vacant;

    public Place(Raylib.Rectangle hitbox, int position){
        this.hitbox = hitbox;
        this.position = position;
        vacant = true;
    }

    public Raylib.Rectangle getHitbox(){
        return hitbox;
    }
    public int getPosition(){
        return position;
    }
    public boolean getVacant(){
        return vacant;
    }

    public void setVacant(boolean vacant){
        this.vacant = vacant;
    }
}
