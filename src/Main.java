
public class Main {
    public static void main(String[] args) {
        //task1
        int total = 0;
        int goal = 2_459_000;
        int monthlyPayment = 15000;
        int i = 1;
        while (total < goal) {
            total += monthlyPayment;
            System.out.printf("Месяц %d, сумма накоплений равна %d рублей\n", i, total);
            i++;
        }
        //task2
        int i2 = 1;
        while (i2 <= 10) {
            System.out.print(i2);
            System.out.print(" ");
            i2++;
        }
        System.out.print("\n");
        for (int i3 = 10; i3 > 0; i3--) {
            System.out.print(i3 + " ");
        }
        System.out.println("\n");
        //task 3
        int people = 12000000;
        int bitrhRateAt1000 = 17;
        int deathRateAt1000 = 8;
        for (int j = 0; j < 10; j++) {
            int addingPeopleAtYear = people / 1000 * (bitrhRateAt1000 - deathRateAt1000);
            System.out.printf("Год %s, численность населения составляет %s\n", j + 1, people + addingPeopleAtYear);
            people += addingPeopleAtYear;
        }
        //task4
        double total2 = 15000;
        int month = 1;
        while (total2 < 12000000) {
            total2 += Math.round(total2 * 0.07);
            System.out.printf("В месяц %s на счету лежит %s\n", month, (int) total2);
            month += 1;
        }
        //task5
        double total3 = 15000;
        int month2 = 1;
        while (total3 < 12000000) {
            total3 += Math.round(total3 * 0.07);
            if (month2 % 6 == 0) {
                System.out.printf("В месяц %s на счету лежит %s\n", month2, (int) total3);
            }
            month2 += 1;
        }
        //task 6
        double total4 = 15000;
        int month4 = 1;
        while (month4 <= 12 * 9) {
            total4 += Math.round(total4 * 0.07);
            if (month4 % 6 == 0) {
                System.out.printf("В месяц %s на счету лежит %s\n", month4, (int) total4);
            }
            month4 += 1;
        }
        //task7
        int numOfFriday = 4;
        for (int x = numOfFriday; x <= 31; x += 7) {
            System.out.printf("Сегодня пятница, %s-е число. Необходимо подготовить отчет\n", x);
        }
        //task 8
        int nowYear = 2024;
        int start = nowYear - 200;
        int end = nowYear + 100;
        for (int y = start; y < end; y += 1) {
            if (y % 79 == 0) {
                System.out.println(y);
            }
        }
    }
}



