package pro1.swingComponents;

import pro1.drawingModel.Drawable;

import javax.swing.*;

public class MainFrame extends JFrame {
    public MainFrame(Drawable example) {
        setTitle("PRO1 Graphics");
        setVisible(true);
        setSize(800, 800);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        add(new DrawingPanel(example));
    }
}