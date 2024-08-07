package org.practice1.Objects;

public class Polygon extends Figure{

    private int numberLades;

    public Polygon(String name, int x, int y, int numberLades, String color ) {
        super(name, x, y, color);
        this.numberLades = numberLades;
    }

    public int getNumberLades() {
        return numberLades;
    }

    public void setNumberLades(int numberLades) {
        this.numberLades = numberLades;
    }
}
