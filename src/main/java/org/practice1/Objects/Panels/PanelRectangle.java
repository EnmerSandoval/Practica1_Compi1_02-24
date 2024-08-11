package org.practice1.Objects.Panels;

import org.practice1.Objects.Rectangle;

import javax.swing.*;
import java.awt.*;

public class PanelRectangle extends JPanel {
    private Rectangle rectangle;

    public PanelRectangle(Rectangle rectangle) {
        this.rectangle = rectangle;
        this.setPreferredSize(new java.awt.Dimension(rectangle.convertStringToInteger(rectangle.getWide()), rectangle.convertStringToInteger(rectangle.getHigh())));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Color color = rectangle.returnColor(rectangle.getColor());
        g.setColor(color);
        g.fillRect(rectangle.getX(), rectangle.getY(), rectangle.convertStringToInteger(rectangle.getWide()), rectangle.convertStringToInteger(rectangle.getHigh()));
    }
}
