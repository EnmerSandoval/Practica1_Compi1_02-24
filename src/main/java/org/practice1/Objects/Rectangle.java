package org.practice1.Objects;

public class Rectangle extends Figure{

    private String high, wide;

    public Rectangle(String name, String x, String y, String high, String wide, String color){
        super(name, x, y, color);
        this.high = high;
        this.wide = wide;
    }

    public int getHigh() {
        return convertStringToInteger(high);
    }

    public void setHigh(String high) {
        this.high = high;
    }

    public int getWide() {
        return convertStringToInteger(wide);
    }

    public void setWide(String wide) {
        this.wide = wide;
    }
}
