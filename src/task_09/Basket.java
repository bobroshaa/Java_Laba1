package task_09;

public class Basket {
    private Ball[] balls;

    public Basket(Ball[] balls) {
        this.balls = balls;
    }

    public double getWeight() {
        double weight = 0;
        for (Ball ball : balls) {
            weight += ball.getWeight();
        }
        return weight;
    }

    public int getBallsCount(String color) {
        int count = 0;
        for (Ball ball : balls) {
            if (ball.getColor().equals(color)) {
                ++count;
            }
        }
        return count;
    }
}
