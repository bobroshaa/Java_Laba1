package task_04;
import java.util.ArrayList;
public class PrimeChecker {
    public ArrayList<Integer> getPrimeNumberIndexes(int[] numbers) {
            var list = new ArrayList<Integer>();
            for (int i = 0; i < numbers.length; ++i) {
                if (isPrime(numbers[i])) {
                    list.add(i + 1);
                }
            }
            return list;
        }

        public static boolean isPrime(long number) {
            if (number < 2) {
                return false;
            }
            for (long i = 2; i <= Math.sqrt(number); ++i) {
                if (number % i == 0) {
                    return false;
                }
            }
            return true;
        }
}
