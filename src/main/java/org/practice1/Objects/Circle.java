package org.practice1.Objects;

public class Circle extends Figure{
    private int radio;

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
}
