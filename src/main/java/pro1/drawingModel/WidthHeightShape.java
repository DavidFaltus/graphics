package pro1.drawingModel;

import java.awt.*;

public abstract class WidthHeightShape extends XYShape {
    protected int width;
    protected int height;

    public WidthHeightShape(int x, int y, int height, int width) {
        super(x,y);
        this.width = width;
        this.height = height;
    }
}
