package task_02;

public class BottomRectangle {
    private int x1 = -6;
    private int x2 = 6;
    private int y1 = -3;
    private int y2 = 0;

    public boolean IsContained(double x, double y) {
        return (x >= x1 && x <= x2 && y >= y1 && y <= y2);
    }
}
