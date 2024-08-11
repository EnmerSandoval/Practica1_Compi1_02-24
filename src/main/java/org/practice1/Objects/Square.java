package org.practice1.Objects;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class Square extends Figure{

    private String lade;

    public Square(String name, String x, String y, String lade, String color) {
        super(name, x, y, color);
        this.lade = lade;
    }

    public int getLade() {
        return convertStringToInteger(lade);
    }

    public void setLade(String lade) {
        this.lade = lade;
    }


}
