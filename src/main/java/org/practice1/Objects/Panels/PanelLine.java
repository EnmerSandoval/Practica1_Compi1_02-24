package org.practice1.Objects.Panels;

import org.practice1.Objects.Line;

import javax.swing.*;
import java.awt.*;

public class PanelLine extends JPanel {
    private Line line;
    public PanelLine(Line line) {
        this.line = line;
        this.setPreferredSize(new Dimension(line.dimensionWidth(), line.dimensionHeight()));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Color color = line.returnColor(line.getColor());
        g.setColor(color);
        g.drawLine(line.getX(), line.getY(), line.getX2(), line.getY2());

        //Texto en medio de la figura
        FontMetrics fm = g.getFontMetrics();
        int textWidth = fm.stringWidth(line.getName());
        int textHeight = fm.getHeight();

        int midX = (line.getX() + line.getX2()) / 2;
        int midY = (line.getY() + line.getY2()) / 2;

        int x = midX - textWidth / 2;
        int y = midY - textHeight / 2;

        g.drawString(line.getName(), x, y);
    }
}
