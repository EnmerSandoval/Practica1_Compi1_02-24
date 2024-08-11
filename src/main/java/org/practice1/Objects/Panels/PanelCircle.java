package org.practice1.Objects.Panels;

import org.practice1.Objects.Circle;

import javax.swing.*;
import java.awt.*;

public class PanelCircle extends JPanel {
    private Circle circle;

    public PanelCircle(Circle circle) {
        this.circle = circle;
        this.setPreferredSize(new Dimension(circle.returnHeight(circle.convertStringToInteger(circle.getRadio())), circle.returnHeight(circle.convertStringToInteger(circle.getRadio()))));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Color color = circle.returnColor(circle.getColor());
        g.setColor(color);
       // g.fillArc(circle.convertStringToInteger(circle.getX()));
    }
}