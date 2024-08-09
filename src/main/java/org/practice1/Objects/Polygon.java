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

    public String getNumberLades() {
        return numberLades;
    }

    public void setNumberLades(String numberLades) {
        this.numberLades = numberLades;
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
