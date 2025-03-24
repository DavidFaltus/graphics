package pro1.drawingModel;

import java.awt.*;

public class Ellipse implements Drawable {
    private int x;
    private int y;
    private int height;
    private int width;
    private String color;

    public Ellipse(int x, int y, int height, int width, String color) {
        this.x = x;
        this.y = y;
        this.height = height;
        this.width = width;
        this.color = color; // např. #FF5099
    }

    @Override
    public void draw(Graphics2D g) {
        g.setColor(Color.decode(color));
        g.fillOval(x,y,width,height);
    }
}
