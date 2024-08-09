package org.practice1.Objects;

public class Square extends Figure{

    private String lade;

    public Square(String name, String x, String y, String lade, String color) {
        super(name, x, y, color);
        this.lade = lade;
    }

    public String getLade() {
        return lade;
    }

    public void setLade(String lade) {
        this.lade = lade;
    }
}
