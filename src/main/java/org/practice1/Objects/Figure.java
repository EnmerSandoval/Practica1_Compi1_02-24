package org.practice1.Objects;

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

    public String getX() {
        return x;
    }

    public void setX(String x) {
        this.x = x;
    }

    public String getY() {
        return y;
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
}

