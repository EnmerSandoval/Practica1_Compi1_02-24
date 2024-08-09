package org.practice1.Objects;

public class Animation {
    private String type, x, y, order;

    public Animation(String type, String x, String y, String order) {
        this.type = type;
        this.x = x;
        this.y = y;
        this.order = order;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }
}
