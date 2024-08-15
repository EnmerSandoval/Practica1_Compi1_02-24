package org.practice1.Stats;

public class StatsColor {
    private int blue, red, yellow, green, orange, gray, cyan, pink, black;

    public StatsColor() {
        blue = 0;
        red = 0;
        yellow = 0;
        green = 0;
        orange = 0;
        gray = 0;
        cyan = 0;
        pink = 0;
        black = 0;
    }

    public int getBlue() {
        return blue;
    }

    public void setBlue(int blue) {
        this.blue = blue;
    }

    public int getRed() {
        return red;
    }

    public void setRed(int red) {
        this.red = red;
    }

    public int getYellow() {
        return yellow;
    }

    public void setYellow(int yellow) {
        this.yellow = yellow;
    }

    public int getGreen() {
        return green;
    }

    public void setGreen(int green) {
        this.green = green;
    }

    public int getOrange() {
        return orange;
    }

    public void setOrange(int orange) {
        this.orange = orange;
    }

    public int getGray() {
        return gray;
    }

    public void setGray(int gray) {
        this.gray = gray;
    }

    public int getCyan() {
        return cyan;
    }

    public void setCyan(int cyan) {
        this.cyan = cyan;
    }

    public int getPink() {
        return pink;
    }

    public void setPink(int pink) {
        this.pink = pink;
    }

    public int getBlack() {
        return black;
    }

    public void setBlack(int black) {
        this.black = black;
    }

    @Override
    public String toString() {
        return "StatsColor{" +
                "blue=" + blue +
                ", red=" + red +
                ", yellow=" + yellow +
                ", green=" + green +
                ", orange=" + orange +
                ", gray=" + gray +
                ", cyan=" + cyan +
                ", pink=" + pink +
                ", black=" + black +
                '}';
    }
}
