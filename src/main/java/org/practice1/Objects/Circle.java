package org.practice1.Objects;

public class Circle extends Figure{
    private String radio;
    private final double pi = 3.1416;

    public Circle(String name, String x, String y, String radio,  String color) {
        super(name, x, y, color);
        this.radio = radio;
    }

    public int getRadio() {
        return convertStringToInteger(radio);
    }

    public void setRadio(String radio) {
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
}
