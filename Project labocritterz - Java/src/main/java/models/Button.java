package models;

public class Button {
    Rectangle hitbox;
    Float position;
    Png image;

    public Button(Rectangle hitbox, Float position, Png image){
        this.hitbox = hitbox;
        this.position = position;
        this.image = image;
    }

    public Rectangle getHitbox(){
        return hitbox;
    }
    public Float getPosition(){
        return position;
    }
    public Png getImage(){
        return image;
    }

    public void setPosition(Float position){
        this.position = position;
    }
}
