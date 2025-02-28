package org.practice1.Objects;

import java.awt.Graphics2D;

public class Rectangle extends Figure{

    private int high, wide;

    public Rectangle(String name, int x, int y, int high, int wide, String color){
        super(name, x, y, color);
        this.high = high;
        this.wide = wide;
    }

    public int getHigh() {
        return high;
    }

    public void setHigh(int high) {
        this.high = high;
    }

    public int getWide() {
        return wide;
    }

    public void setWide(int wide) {
        this.wide = wide;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "name= " + getName() +
                ", x= " + getX() +
                ", y= " + getY() +
                ", color= " + getColor() +
                "high=" + high +
                ", wide=" + wide +
                '}';
    }

    @Override
    public void draw(Graphics2D g2d) {
       g2d.setColor(returnColor(getColor()));
       g2d.fillRect(getX(), getY(), getWide(), getHigh());   
    }
}
