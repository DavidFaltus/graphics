package pro1.swingComponents;

import pro1.drawingModel.Drawable;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ParkPlanningFrame extends JFrame {
    private DrawingPanel drawingPanel;
    private int lastX;
    private int lastY;

    public ParkPlanningFrame(Drawable drawable) {
        setTitle("Park Planning");
        setVisible(true);
        setSize(800, 800);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        drawingPanel = new DrawingPanel(drawable);

        drawingPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                lastX = e.getX();
                lastY = e.getY();
            }
        });
    }
}
