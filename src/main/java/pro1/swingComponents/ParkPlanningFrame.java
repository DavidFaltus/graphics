package pro1.swingComponents;

import pro1.drawingModel.Drawable;
import pro1.drawingModel.Group;
import pro1.drawingModel.Tree;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;

public class ParkPlanningFrame extends JFrame {
    private DrawingPanel drawingPanel;
    private JButton resetButton;
    private JTextField heightField;

    private List<Drawable> trees = new ArrayList<>();

    public ParkPlanningFrame() {
        super("Park Planning");
        setLayout(new BorderLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800, 800);
        JPanel leftPanel = new JPanel();
        leftPanel.setLayout(new BoxLayout(leftPanel, BoxLayout.Y_AXIS));
        leftPanel.setPreferredSize(new Dimension(200, 0));

        heightField = new JTextField("80");
        heightField.setMaximumSize(new Dimension(
                Integer.MAX_VALUE,
                heightField.getPreferredSize().height
        ));
        leftPanel.add(new JLabel("Zadejte výšku stromu (px):"));
        leftPanel.add(heightField);

        resetButton = new JButton("Reset");
        leftPanel.add(Box.createVerticalStrut(10));
        leftPanel.add(resetButton);

        drawingPanel = new DrawingPanel(
                new Group(new Drawable[] {}, 0, 1, 1)
        );

        drawingPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int x = e.getX() - 400;
                int y = e.getY() - 400;

                int height;
                try {
                    height = Integer.parseInt(heightField.getText().trim());
                } catch (NumberFormatException ex) {
                    height = 80;
                }

                Drawable newTree = new Tree(x, y, height);

                trees.add(newTree);
                refreshDrawing();
            }
        });

        resetButton.addActionListener(e -> {
            trees.clear();
            refreshDrawing();
        });

        add(leftPanel, BorderLayout.WEST);
        add(drawingPanel, BorderLayout.CENTER);

        setVisible(true);
    }

    private void refreshDrawing() {
        Drawable groupOfTrees =
                new Group(trees.toArray(new Drawable[0]), 0, 1, 1);
        drawingPanel.setImage(groupOfTrees);
    }
}
