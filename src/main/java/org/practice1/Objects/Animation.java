package org.practice1.Objects;

public class Animation {
    private String type;
    private int x, y, order;

    public Animation(String type, int x, int y, int order) {
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

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    
    @Override
    public String toString() {
        return "Animation{" +
                "type='" + type + '\'' +
                ", x='" + x + '\'' +
                ", y='" + y + '\'' +
                ", order='" + order + '\'' +
                '}';
    }
}

