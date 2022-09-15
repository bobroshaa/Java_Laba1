package task_05;

public class Calculator {
    public int CountUnnecessaryNumbers(int[] array) {
        if (array.length == 0) {
            return 0;
        }
        int count = 0;
        int maxNum = array[0];
        for (int i = 1; i < array.length; ++i) {
            if (array[i] <= maxNum) {
                ++count;
            } else {
                maxNum = array[i];
            }
        }
        return count;
    }
}

