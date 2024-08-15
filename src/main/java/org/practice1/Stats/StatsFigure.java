package org.practice1.Stats;

public class StatsFigure {
    private int circle, square, rectangle, line, polygon;
    private int lineAnimation, curveAnimation;

    public StatsFigure(){
        circle = 0;
        square = 0;
        rectangle = 0;
        line = 0;
        polygon = 0;
        lineAnimation = 0;
        curveAnimation = 0;
    }

    public int getCircle() {
        return circle;
    }

    public void setCircle(int circle) {
        this.circle = circle;
    }

    public int getSquare() {
        return square;
    }

    public void setSquare(int square) {
        this.square = square;
    }

    public int getRectangle() {
        return rectangle;
    }

    public void setRectangle(int rectangle) {
        this.rectangle = rectangle;
    }

    public int getLine() {
        return line;
    }

    public void setLine(int line) {
        this.line = line;
    }

    public int getPolygon() {
        return polygon;
    }

    public void setPolygon(int polygon) {
        this.polygon = polygon;
    }

    public int getLineAnimation() {
        return lineAnimation;
    }

    public void setLineAnimation(int lineAnimation) {
        this.lineAnimation = lineAnimation;
    }

    public int getCurveAnimation() {
        return curveAnimation;
    }

    public void setCurveAnimation(int curveAnimation) {
        this.curveAnimation = curveAnimation;
    }

    @Override
    public String toString() {
        return "StatsFigure{" +
                "circle=" + circle +
                ", square=" + square +
                ", rectangle=" + rectangle +
                ", line=" + line +
                ", polygon=" + polygon +
                ", lineAnimation=" + lineAnimation +
                ", curveAnimation=" + curveAnimation +
                '}';
    }
}
