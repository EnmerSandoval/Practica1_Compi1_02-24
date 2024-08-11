package org.practice1.Objects;

public class Polygon extends Figure{

    private String numberLades;
    private String high, wide;

    public Polygon(String name, String x, String y, String numberLades, String high, String wide, String color ) {
        super(name, x, y, color);
        this.numberLades = numberLades;
        this.high = high;
        this.wide = wide;
    }

    public int getNumberLades() {
        return convertStringToInteger(numberLades);
    }

    public void setNumberLades(String numberLades) {
        this.numberLades = numberLades;
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
