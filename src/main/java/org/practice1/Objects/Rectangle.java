package org.practice1.Objects;

public class Rectangle extends Figure{

    private String high, wide;

    public Rectangle(String name, String x, String y, String high, String wide, String color){
        super(name, x, y, color);
        this.high = high;
        this.wide = wide;
    }

    public String getHigh() {
        return high;
    }

    public void setHigh(String high) {
        this.high = high;
    }

    public String getWide() {
        return wide;
    }

    public void setWide(String wide) {
        this.wide = wide;
    }
}
