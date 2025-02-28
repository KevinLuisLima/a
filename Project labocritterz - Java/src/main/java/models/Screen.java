package models;

public class Screen {
    Float height;
    Float width;

    public Screen(Float height, Float width){
        this.height = height;
        this.width = width;
    }

    public Float getHeight(){
        return height;
    }
    public Float getWidth(){
        return width;
    }
}
