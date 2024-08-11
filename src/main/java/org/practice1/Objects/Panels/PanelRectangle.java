package org.practice1.Objects.Panels;

import org.practice1.Objects.Rectangle;

import javax.swing.*;
import java.awt.*;

public class PanelRectangle extends JPanel {
    private Rectangle rectangle;

    public PanelRectangle(Rectangle rectangle) {
        this.rectangle = rectangle;
        this.setPreferredSize(new java.awt.Dimension(rectangle.getWide(), rectangle.getHigh()));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Color color = rectangle.returnColor(rectangle.getColor());
        g.setColor(color);
        g.fillRect(rectangle.getX(), rectangle.getY(), rectangle.getWide(), rectangle.getHigh());

        //Texto en medio de la figura
        FontMetrics fm = g.getFontMetrics();
        int textWidth = fm.stringWidth(rectangle.getName());
        int textHeight = fm.getHeight();

        int x = rectangle.getX() + (rectangle.getWide() / 2);
        int y = rectangle.getY() + (rectangle.getHigh() / 2);

        g.drawString(rectangle.getName(), x, y);
    }
}
