package task_02;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите x: ");
        double x = scanner.nextDouble();
        System.out.println("Введите y: ");
        double y = scanner.nextDouble();
        TopRectangle topRectangle = new TopRectangle();
        BottomRectangle bottomRectangle = new BottomRectangle();
        System.out.println("Result: " + (topRectangle.IsContained(x, y) || bottomRectangle.IsContained(x, y)));
    }
}
