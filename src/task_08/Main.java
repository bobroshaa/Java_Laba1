package task_08;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] a = InputArray.GetArray();
        int[] b = InputArray.GetArray();
        System.out.println(Arrays.toString(SequenceMerger.getInsertionIndexes(a, b)));
    }
}