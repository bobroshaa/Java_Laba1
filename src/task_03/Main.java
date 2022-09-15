package task_03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите a: ");
        double a = scanner.nextDouble();
        System.out.println("Введите b: ");
        double b = scanner.nextDouble();
        System.out.println("Введите шаг: ");
        double h = scanner.nextDouble();
        while (a <= b) {
            System.out.println("| x = " + String.format("%5.2f", a) + " | tan(x) = " + String.format("%7.3f", Math.tan(a)) + " |");
            a += h;
        }
    }
}