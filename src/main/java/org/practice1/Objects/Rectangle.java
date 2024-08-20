package org.practice1.Objects;

import org.practice1.Objects.Panels.PanelRectangle;

public class Rectangle extends Figure{

    private int high, wide;
    private PanelRectangle panelRectangle;

    public Rectangle(String name, int x, int y, int high, int wide, String color){
        super(name, x, y, color);
        this.high = high;
        this.wide = wide;
        this.panelRectangle = new PanelRectangle(this);
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

    public PanelRectangle getPanelRectangle() {
        return panelRectangle;
    }

    public void setPanelRectangle(PanelRectangle panelRectangle) {
        this.panelRectangle = panelRectangle;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "name= " + getName() +
                ", x= " + getX() +
                ", y= " + getY() +
                ", color= " + getColor() +
                "high=" + high +
                ", wide=" + wide +
                '}';
    }
}
