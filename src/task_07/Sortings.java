package task_07;

public class Sortings {
    public static int[] ShellSort(int[] array)
    {
        int i, j, step, temp;
        for (step = array.length / 2; step > 0; step /= 2) {
            for (i = step; i < array.length; i++) {
                temp = array[i];
                for (j = i; j >= step; j -= step) {
                    if (temp < array[j - step]) {
                        array[j] = array[j - step];
                    } else {
                        break;
                    }
                }
                array[j] = temp;
            }
        }
        return array;
    }
}
