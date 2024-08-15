package org.practice1.Objects.Panels;

import org.practice1.Objects.Square;

import javax.swing.*;
import java.awt.*;

public class PanelSquare extends JPanel {
    private Square square;

    public PanelSquare(Square square) {
        this.square = square;
        System.out.println(square.getLade());
        this.setPreferredSize(new java.awt.Dimension(square.getLade(), square.getLade()));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Color color = square.returnColor(square.getColor());
        
        g.fillRect(square.getX(), square.getY(), square.getLade(),square.getLade());
        
        FontMetrics fm = g.getFontMetrics();
        int width = fm.stringWidth(square.getName());
        int height = fm.getHeight();

        int x = square.getX() + (width / 2);
        int y = square.getY() + (height / 2);
        g.setColor(color);
        g.drawString(square.getName(), x, y);
    }
}
