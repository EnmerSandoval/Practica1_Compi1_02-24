package org.practice1.Objects.Panels;

import org.practice1.Objects.Polygon;

import javax.swing.*;
import java.awt.*;

public class PanelPolygon extends JPanel {
    private Polygon polygon;
    public PanelPolygon(Polygon polygon) {
        this.polygon = polygon;
        this.setPreferredSize(new Dimension(polygon.getWide(), polygon.getHigh()));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        int centerX = polygon.getX();
        int centerY = polygon.getY();
        int sides = polygon.getNumberLades();

        int width = polygon.getWide();
        int height = polygon.getHigh();

        int[] xPoints = new int[sides];
        int[] yPoints = new int[sides];

        for (int i = 0; i < sides; i++) {
            xPoints[i] = centerX + (int) ((width / 2.0) * Math.cos(2 * Math.PI * i / sides));
            yPoints[i] = centerY + (int) ((height / 2.0) * Math.sin(2 * Math.PI * i / sides));
        }

        Color color = polygon.returnColor(polygon.getColor());
        g.fillPolygon(xPoints, yPoints, sides);

        FontMetrics fm = g.getFontMetrics();
        int textWidth = fm.stringWidth(polygon.getName());
        int textHeight = fm.getHeight();

        int textX = centerX - textWidth / 2;
        int textY = centerY - textHeight / 2;

        g.setColor(color);
        g.drawString(polygon.getName(), textX, textY);
    }
}
