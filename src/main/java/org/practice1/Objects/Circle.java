package org.practice1.Objects;

public class Circle extends Figure{
    private String radio;

    public Circle(String name, String x, String y, String radio,  String color) {
        super(name, x, y, color);
        this.radio = radio;
    }

    public String getRadio() {
        return radio;
    }

    public void setRadio(String radio) {
        this.radio = radio;
    }
}
