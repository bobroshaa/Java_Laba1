package task_08;

import java.util.Scanner;

public class InputArray {
    public static int[] GetArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter number: ");
            array[i] = scanner.nextInt();
        }
        return array;
    }
}
