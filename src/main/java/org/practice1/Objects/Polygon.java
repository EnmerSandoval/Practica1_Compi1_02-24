package org.practice1.Objects;

import org.practice1.Objects.Panels.PanelPolygon;

public class Polygon extends Figure{

    private int numberLades;
    private int high, wide;
    private PanelPolygon panelPolygon;

    public Polygon(String name, int x, int y, int numberLades, int high, int wide, String color ) {
        super(name, x, y, color);
        this.numberLades = numberLades;
        this.high = high;
        this.wide = wide;
        this.panelPolygon = new PanelPolygon(this);
    }

    public int getNumberLades() {
        return numberLades;
    }

    public void setNumberLades(int numberLades) {
        this.numberLades = numberLades;
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

    public PanelPolygon getPanelPolygon() {
        return panelPolygon;
    }

    public void setPanelPolygon(PanelPolygon panelPolygon) {
        this.panelPolygon = panelPolygon;
    }

    @Override
    public String toString() {
        return "Polygon{" +
                "name='" + getName() +
                ", x=" + getX() +
                ", y=" + getY() +
                ", color='" + getColor() +
                "numberLades=" + numberLades +
                ", high=" + high +
                ", wide=" + wide +
                '}';
    }
}