package task_01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите x: ");
        double x = scanner.nextDouble();
        System.out.println("Введите y: ");
        double y = scanner.nextDouble();
        double numerator = 1 + Math.pow(Math.sin(x+y), 2);
        double denominator = 2 + Math.abs(x - 2 * x/(1 + x*x*y*y));
        double res = numerator / denominator + x;
        System.out.println("Результат: " + res);
    }
}