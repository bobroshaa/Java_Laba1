package task_09;

public class Main {
    public static void main(String[] args) {
        var basket = new Basket(new Ball[] {
                new Ball(1, "blue"),
                new Ball(2, "blue"),
                new Ball(3, "blue"),
                new Ball(4, "red"),
                new Ball(5, "red")
        });
        System.out.println("Weight: " + basket.getWeight());
        System.out.println("Blue balls count: " + basket.getBallsCount("blue"));
    }
}