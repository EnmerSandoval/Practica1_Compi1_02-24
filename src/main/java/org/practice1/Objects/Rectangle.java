package org.practice1.Objects;

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
}
