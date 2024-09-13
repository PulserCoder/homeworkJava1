
public class Main {
    public static void main(String[] args) {
        //task1
        for (int i = 1; i < 11; i++) {
            System.out.println(i);
        }
        //task 2
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }
        //task 3;
        for (int i = 0; i <= 17; i += 2) {
            System.out.println(i);
        }
        //task 4;
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }
        //task 5;
        for (int i = 1904; i <= 2094; i += 4) {
            System.out.println(i + " год является високосным");
        }
        //task 6;
        for (int i = 7; i <= 98; i += 7) {
            System.out.println(i);
        }
        //task 7;
        for (int i = 0; i < 10; i++) {
            System.out.println(Math.pow(2, i));
        } // or another solution
        int previous = 1;
        System.out.println(previous);
        for (int i = 1; i < 10; i++) {
            previous *= 2;
            System.out.println(previous);
        }
        //task 8;
        int summOfInvestment = 29000;
        int sumInBank = 0;
        for (int i = 1; i < 13; i++) {
            sumInBank += summOfInvestment;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + sumInBank + " рублей");
        }
        //task 9;
        int summOfInvestment2 = 29000;
        float sumInBank2 = 0f;
        float percentage = 0.01f;
        for (int i = 1; i < 13; i++) {
            sumInBank2 += summOfInvestment2;
            sumInBank2 += sumInBank2 * percentage;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + sumInBank2 + " рублей");
        }
        //task 10;
        for (int i = 1; i <= 10; i++) {
            System.out.println("2 * " + i + " = " + 2 * i);
        }

    }
}



