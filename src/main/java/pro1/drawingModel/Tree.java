package pro1.drawingModel;

import java.awt.*;

public class Tree extends XYShape {

    private int height;

    public Tree(int x, int y, int height) {
        super(x, y);
        this.height = height;
    }

    @Override
    public void draw(Graphics2D g) {
        int trunkWidth = Math.max(4, height / 8);
        int trunkHeight = Math.max(10, height / 4);

        g.setColor(new Color(101, 67, 33));
        g.fillRect(x - trunkWidth / 2, y - trunkHeight, trunkWidth, trunkHeight);

        int crownDiameter = (int) (height * 0.6);
        g.setColor(Color.GREEN);
        g.fillOval(
                x - crownDiameter / 2,
                y - trunkHeight - crownDiameter,
                crownDiameter,
                crownDiameter
        );
    }
}
