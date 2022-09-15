package task_02;

public class TopRectangle {
    private int x1 = -4;
    private int x2 = 4;
    private int y1 = 0;
    private int y2 = 5;

    public boolean IsContained(double x, double y) {
        return (x >= x1 && x <= x2 && y >= y1 && y <= y2);
    }
}
