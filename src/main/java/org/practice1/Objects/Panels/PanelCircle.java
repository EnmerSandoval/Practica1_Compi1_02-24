package org.practice1.Objects.Panels;

import org.practice1.Objects.Circle;

import javax.swing.*;
import java.awt.*;

public class PanelCircle extends JPanel {
    private Circle circle;

    public PanelCircle(Circle circle) {
        this.circle = circle;
        this.setPreferredSize(new Dimension(circle.returnHeight(circle.getRadio()), circle.returnHeight(circle.getRadio())));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Color color = circle.returnColor(circle.getColor());
        g.setColor(color);
        g.fillArc(circle.getX(), circle.getY(), circle.returnHeight(circle.getRadio()), circle.returnHeight(circle.getRadio()), 0, 360);

        //Texto en medio de la figura
        FontMetrics fm = g.getFontMetrics();
        int textWidth = fm.stringWidth(circle.getName());
        int textHeight = fm.getHeight();
        int x = circle.getX() + (circle.getDiameter(circle.getRadio()) - textWidth) / 2;
        int y = circle.getY() + (circle.getDiameter(circle.getRadio()) - textHeight) / 2;

        g.drawString(circle.getName(), x, y);
    }
}