import java.util.Arrays;
import java.util.StringJoiner;

public class Main {
    public static void main(String[] args) {
        //task1
        int[] mTask1 = new int[3];
        mTask1[0] = 1;
        mTask1[1] = 2;
        mTask1[2] = 3;
        float[] mTask1_2 = {1.57f, 7.654f, 9.986f};
        int[] m3 = {4, 5, 6};
        //task2
        System.out.print(mTask1[0]);
        for (int i = 1; i < mTask1.length; i++) {
            System.out.print(", ");
            System.out.print(mTask1[i]);
        }
        System.out.print("\n");
        System.out.print(mTask1_2[0]);
        for (int i = 1; i < mTask1_2.length; i++) {
            System.out.print(", ");
            System.out.print(mTask1_2[i]);
        }
        System.out.print("\n");
        System.out.print(m3[0]);
        for (int i = 1; i < m3.length; i++) {
            System.out.print(", ");
            System.out.print(m3[i]);
        }

        //task3
        System.out.print("\n");
        System.out.print(mTask1[mTask1.length - 1]);
        for (int i = 1; i > -1; i--) {
            System.out.print(", ");
            System.out.print(mTask1[i]);
        }
        System.out.print("\n");
        System.out.print(mTask1_2[mTask1_2.length - 1]);
        for (int i = 1; i > -1; i--) {
            System.out.print(", ");
            System.out.print(mTask1_2[i]);
        }
        System.out.print("\n");
        System.out.print(m3[m3.length - 1]);
        for (int i = 1; i > -1; i--) {
            System.out.print(", ");
            System.out.print(m3[i]);
        }
        System.out.print("\n");
        //task4
        for (int i = 0; i < mTask1.length; i++) {
            if (mTask1[i] % 2 != 0) {
                mTask1[i] += 1;
            }
        }
        for (int i = 0; i < mTask1.length; i++) {
            System.out.println(mTask1[i]);
        }
        // or
        System.out.println(Arrays.toString(mTask1));

    }
}



