package org.practice1.Objects;

import org.practice1.Objects.Panels.PanelSquare;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class Square extends Figure{

    private int lade;
    private PanelSquare panelSquare;

    public Square(String name, int x, int y, int lade, String color) {
        super(name, x, y, color);
        this.lade = lade;
        this.panelSquare = new PanelSquare(this);
    }

    public int getLade() {
        return lade;
    }

    public void setLade(int lade) {
        this.lade = lade;
    }

    public PanelSquare getPanelSquare() {
        return panelSquare;
    }

    public void setPanelSquare(PanelSquare panelSquare) {
        this.panelSquare = panelSquare;
    }

    @Override
    public String toString() {
        return "Square{" +
                "name=" + getName()+
                ", x=" + getX()+
                ", y=" + getY()+
                ", color= " + getColor()+
                ", lade=" + lade +
                '}';
    }
}
