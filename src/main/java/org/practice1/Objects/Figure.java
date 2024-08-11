package org.practice1.Objects;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.awt.*;

public class Figure {

    private String name;
    private String x;
    private String y;
    private String color;
    private Animation animation;

    public Figure() {
    }

    public Figure(String name, String x, String y, String color) {
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
        return convertStringToInteger(this.x);
    }

    public void setX(String x) {
        this.x = x;
    }

    public int getY() {
        return convertStringToInteger(this.y);
    }

    public void setY(String y) {
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
        switch (color){
            case "azul":
                return Color.BLUE;
            case "rojo":
                return Color.RED;
            case "amarillo":
                return Color.YELLOW;
            case "verde":
                return Color.GREEN;
            case "naranja":
                return Color.ORANGE;
            case "gris":
                return Color.GRAY;
            case "morado":
                return Color.CYAN;
            case "cafe":
                return Color.PINK;
            case "negro":
                return Color.BLACK;
            default:
                return Color.BLACK;
        }
    }
}

