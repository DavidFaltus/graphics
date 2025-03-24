package pro1.drawingModel;

import java.awt.*;

public abstract class XYShape implements Drawable {
    protected double x;
    protected double y;

    public XYShape(double x, double y) {
        this.x = x;
        this.y = y;
    }
}
