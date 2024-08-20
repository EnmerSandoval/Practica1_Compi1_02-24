package org.practice1.Objects;

import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class Square extends Figure{

    private int lade;

    public Square(String name, int x, int y, int lade, String color) {
        super(name, x, y, color);
        this.lade = lade;
    }

    public int getLade() {
        return lade;
    }

    public void setLade(int lade) {
        this.lade = lade;
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

    @Override
    public void draw(Graphics2D g2d) {
        g2d.setColor(returnColor(getColor()));
        g2d.fillRect(getX(), getY(), getLade(), getLade());
    }
}
