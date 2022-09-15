package task_07;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = scanner.nextInt();
        var array = new int[size];
        for (int i = 0; i < size; ++i) {
            System.out.print("Enter number: ");
            array[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(Sortings.ShellSort(array)));
    }
}