package org.practice1.Objects;

public class Line extends Figure{

    private String x2, y2;

    public Line(String name, String x, String y, String x2, String y2, String color){
        super(name, x, y, color);
        this.x2 = x2;
        this.y2 = y2;
    }

    public int getX2() {
        return convertStringToInteger(x2);
    }

    public void setX2(String x2) {
        this.x2 = x2;
    }

    public int getY2() {
        return convertStringToInteger(y2);
    }

    public void setY2(String y2) {
        this.y2 = y2;
    }

    public int dimensionHeight(){
        return convertStringToInteger(x2) + convertStringToInteger(y2);
    }

    public int dimensionWidth(){
        return convertStringToInteger(x2) + convertStringToInteger(y2);
    }
}
