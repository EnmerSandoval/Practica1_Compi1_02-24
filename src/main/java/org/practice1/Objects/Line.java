package org.practice1.Objects;

import java.awt.Graphics2D;

public class Line extends Figure{

    private int x2, y2;

    public Line(String name, int x, int y, int x2, int y2, String color){
        super(name, x, y, color);
        this.x2 = x2;
        this.y2 = y2;
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public int getY2() {
        return y2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }

    public int dimensionHeight(){
        return x2 + y2;
    }

    public int dimensionWidth(){
        return x2 + y2;
    }


    @Override
    public String toString() {
        return "Line{" +
                "name=" + getName() +
                ", x=" + getX() +
                ", y=" + getY() +
                ", color=" + getColor() +
                "x2=" + x2 +
                ", y2=" + y2 +
                '}';
    }

    @Override
    public void draw(Graphics2D g2d) {
        g2d.setColor(returnColor(getColor()));
        g2d.drawLine(getX(), getY(), getX2(), getY2());
    }
}
