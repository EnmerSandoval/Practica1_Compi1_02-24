package org.practice1.Objects;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.awt.*;

public class Figure {

    private String name;
    private int x;
    private int y;
    private String color;
    private Animation animation;

    public Figure() {
    }

    public Figure(String name, int x, int y, String color) {
        this.name = name;
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public Figure(Animation animation) {
        this.animation = animation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Animation getAnimation() {
        return animation;
    }

    public void setAnimation(Animation animation) {
        this.animation = animation;
    }

    public int convertStringToInteger(String str){
        ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
        ScriptEngine scriptEngine = scriptEngineManager.getEngineByName("JavaScript");

        try {
            Object result = scriptEngine.eval(str);
            return ((Double) result).intValue();
        } catch (ScriptException e) {
            e.printStackTrace();
        }
        return 0;
    }

    public Color returnColor(String color){
        return switch (color) {
            case "azul" -> Color.BLUE;
            case "rojo" -> Color.RED;
            case "amarillo" -> Color.YELLOW;
            case "verde" -> Color.GREEN;
            case "naranja" -> Color.ORANGE;
            case "gris" -> Color.GRAY;
            case "morado" -> Color.CYAN;
            case "cafe" -> Color.PINK;
            case "negro" -> Color.BLACK;
            default -> Color.BLACK;
        };
    }

    @Override
    public String toString() {
        return "Figure{" +
                "name='" + name + '\'' +
                ", x=" + x +
                ", y=" + y +
                ", color='" + color + '\'' +
                ", animation=" + animation +
                '}';
    }
}