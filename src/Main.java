import java.util.Arrays;
import java.util.StringJoiner;

public class Main {
    public static void main(String[] args) {
        //task1
        int[] spendings = new int[]{1000, 25000, 21000, 19000, 5500};
        int total = 0;
        for (int i = 0; i < spendings.length; i++) {
            total += spendings[i];
        }
        System.out.printf("Сумма трат за месяц составила %s рублей\n", total);
        //task 2
        int[] spendings2 = new int[]{1000, 25000, 21000, 19000, 5500};
        int minn = Integer.MAX_VALUE;
        int maxn = Integer.MIN_VALUE;
        for (int i = 0; i < spendings2.length; i++) {
            if (spendings2[i] < minn) {
                minn = spendings2[i];
            }
            if (spendings2[i] > maxn) {
                maxn = spendings2[i];
            }
        }
        System.out.printf("Минимальная сумма трат за неделю составила %s рублей. Максимальная сумма трат за неделю составила %s рублей\n", minn, maxn);
        //task3
        int[] spendings3 = new int[]{1000, 25000, 21000, 19000, 5500};
        int sum = 0;
        for (int i = 0; i < spendings3.length; i++) {
            sum += spendings3[i];
        }
        System.out.printf("Средняя сумма трат за месяц составила %s рублей\n", sum / (float) spendings3.length);
        //task 4
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i > -1; i--) {
            System.out.printf(Character.toString(reverseFullName[i]));
        }
    }

}



