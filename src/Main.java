
public class Main {
    public static void main(String[] args) {
        byte byteVar = 10;
        int intVar = 100000;
        short shortVar = 1000;
        long longVar = 1000000000L;
        float floatVar = 1.4f;
        double doubleVar = 1.123123;
        System.out.println("Значение переменной byteVar с типом byte равно " + byteVar);
        System.out.println("Значение переменной intVar с типом int равно " + intVar);
        System.out.println("Значение переменной shortVar с типом short равно " + shortVar);
        System.out.println("Значение переменной longVar с типом long равно " + longVar);
        System.out.println("Значение переменной floatVar с типом float равно " + floatVar);
        System.out.println("Значение переменной doubleVar с типом double равно " + doubleVar);

        float task2VarFloat = 27.12f;
        long task2VarLong = 987678965549L;
        double task2VarDouble = 2.786;
        short task2VarShort = 569;
        short task2VarShort2 = -159;
        int task2VarInt = 27897;
        byte task2VarByte = 67;

        byte teacher1 = 23;
        byte teacher2 = 27;
        byte teacher3 = 30;
        short paperQuantity = 480;
        System.out.println("На каждого ученика рассчитано " + paperQuantity / (teacher1 + teacher2 + teacher3) + " листов бумаги");
        byte paintingQuantity = 120;
        byte colorWhite = 2;
        byte colorBrown = 4;
        System.out.println("В школе, где " + paintingQuantity / (colorBrown + colorWhite) + " классов, нужно " + (paintingQuantity / (colorBrown + colorWhite)) * 2 + " банок белой краски и " + (paintingQuantity / (colorBrown + colorWhite)) * 4 + " банок коричневой краски");

        byte bananasQuantity = 5;
        short weightOneBanana = 80;
        short vMilk = 200;
        short grammsIn100mlMilk = 105;
        byte quantityOfIcecream = 2;
        short weightOneIcecream = 100;
        byte quantityOfEggs = 4;
        short weightOneEgg = 70;
        float result = 0f;
        result += bananasQuantity * weightOneBanana;
        result += (vMilk / 100) * grammsIn100mlMilk;
        result += quantityOfIcecream * weightOneIcecream;
        result += quantityOfEggs * weightOneEgg;
        float resultInKG = result / 1000;
        System.out.println("gm: " + Math.round(result) + " kg: " + resultInKG);

        byte weightToLose = 7;
        short lowerLineToLoseG = 250;
        short upperLineToLoseG = 500;
        int daysForLoseByLowerLine = (weightToLose * 1000) / lowerLineToLoseG;
        int daysForLoseByUpperLine = (weightToLose * 1000) / upperLineToLoseG;
        System.out.println("at 250g: " + daysForLoseByLowerLine + "\nat 500g: " + daysForLoseByUpperLine + "\naverage days: " + (daysForLoseByLowerLine + daysForLoseByUpperLine) / 2);


        int salaryMaria = 67760;
        int salaryDenis = 83690;
        int salaryKristina = 76230;
        float newSalaryMaria = salaryMaria + (salaryMaria * 0.1f);
        float newSalaryDenis = salaryDenis + (salaryDenis * 0.1f);
        float newSalaryKristina = salaryKristina + (salaryKristina * 0.1f);
        int salaryPerYearMaria = salaryMaria * 12;
        int salaryPerYearDenis = salaryDenis * 12;
        int salaryPerYearKristina = salaryKristina * 12;
        float newSalaryPerYearMaria = newSalaryMaria * 12;
        float newSalaryPerYearDenis = newSalaryDenis * 12;
        float newSalaryPerYearKristina = newSalaryKristina * 12;
        System.out.println("Маша теперь получает " + newSalaryMaria + " рублей. Годовой доход вырос на " + (newSalaryPerYearMaria - salaryPerYearMaria) +" рублей");
        System.out.println("Денис теперь получает " + newSalaryDenis + " рублей. Годовой доход вырос на " + (newSalaryPerYearDenis - salaryPerYearDenis) +" рублей");
        System.out.println("Кристина теперь получает " + newSalaryKristina + " рублей. Годовой доход вырос на " + (newSalaryPerYearKristina - salaryPerYearKristina) +" рублей");




    }
}



