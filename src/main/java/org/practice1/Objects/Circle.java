package org.practice1.Objects;

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
        return getRadio()*getRadio();
    }

    @Override
    public String toString() {
        return "Circle{" +
                "name='" + getName() +
                ", x=" + getX() +
                ", y=" + getY() +
                ", color='" + getColor() +
                ", radio=" + radio +
                ", animation=" + getAnimation().toString() +
                '}';
    }
}
