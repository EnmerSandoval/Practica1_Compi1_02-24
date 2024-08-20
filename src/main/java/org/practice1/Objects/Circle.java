package org.practice1.Objects;

import java.awt.Graphics2D;

public class Circle extends Figure{
    private int radio;
    private final double pi = 3.1416;

    public Circle(String name, int x, int y, int radio,  String color) {
        super(name, x, y, color);
        this.radio = radio;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    public double getPi() {
        return pi;
    }

    public int returnHeight(int radio){
        return ((Double) (getPi()*radio*radio)).intValue();
    }

    public int getDiameter(int radio){
        return getRadio()*2;
    }


     @Override
    public void draw(Graphics2D g2d) {
        g2d.setColor(this.returnColor(getColor()));
        g2d.fillOval(getX(), getY(), getDiameter(getRadio()), getDiameter(getRadio()));
    }
   
    @Override
    public String toString() {
        return "Circle{" +
                "name='" + getName() +
                ", x=" + getX() +
                ", y=" + getY() +
                ", color='" + getColor() +
                ", radio=" + radio +
                '}';
    }
}
