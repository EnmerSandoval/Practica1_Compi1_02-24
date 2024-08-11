package org.practice1.Objects.Panels;

import org.practice1.Objects.Square;

import javax.swing.*;
import java.awt.*;

public class PanelSquare extends JPanel {
    private Square square;

    public PanelSquare(Square square) {
        this.square = square;
        this.setPreferredSize(new java.awt.Dimension(square.convertStringToInteger(square.getLade()), square.convertStringToInteger(square.getLade())));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Color color = square.returnColor(square.getColor());
        g.setColor(color);
        g.fillRect(square.getX(), square.getY(), square.convertStringToInteger(square.getLade()),square.convertStringToInteger(square.getLade()));
    }
}
