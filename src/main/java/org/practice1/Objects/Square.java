package org.practice1.Objects;

public class Square extends Figure{

    private int lade;

    public Square(String name, int x, int y, int lade, String color) {
        super(name, x, y, color);
        this.lade = lade;
    }

    public int getLade() {
        return lade;
    }

    public void setLade(int lade) {
        this.lade = lade;
    }
}
