package org.practice1.Objects;

import java.awt.Graphics2D;

public class Polygon extends Figure{

    private int numberLades;
    private int high, wide;

    public Polygon(String name, int x, int y, int numberLades, int high, int wide, String color ) {
        super(name, x, y, color);
        this.numberLades = numberLades;
        this.high = high;
        this.wide = wide;
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

    @Override
    public void draw(Graphics2D g2d) {
     g2d.setColor(returnColor(getColor()));
        int[] xPoints = new int[getNumberLades()];
        int[] yPoints = new int[getNumberLades()];

        double angle = 2 * Math.PI / numberLades;
        for (int i = 0; i < numberLades; i++) {
            xPoints[i] = (int) (getX() + wide * Math.cos(i * angle));
            yPoints[i] = (int) (getY() + high * Math.sin(i * angle));
        }

        java.awt.Polygon polygon = new java.awt.Polygon(xPoints, yPoints, numberLades);
        g2d.fillPolygon(polygon);    
    }
}