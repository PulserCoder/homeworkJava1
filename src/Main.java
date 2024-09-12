
public class Main {
    public static void main(String[] args) {

        //task1
        int age = 19;
        if (age >= 18) {
            System.out.println("U are older than 18");
        } else {
            System.out.println("U are younger than 18");
        }
        //task2
        int temperature = 4;
        if (temperature < 5) {
            System.out.println("Hа улице холодно, нужно надеть шапку");
        } else {
            System.out.println("Сегодня тепло, можно идти без шапки");
        }
        //task3
        int speed = 54;
        String startText = "Если скорость " + speed;
        if (speed > 60) {
            System.out.println(startText + " то, придется заплатить штраф");
        } else {
            System.out.println(startText + " то, можно ездить спокойно");
        }
        //task4
        int agePerson = 35;
        if (2 <= agePerson && agePerson <= 6) {
            System.out.println("Если возраст человека равен " + agePerson + ", то ему нужно ходить в садик ");
        } else if (agePerson >= 7 && agePerson <= 17) {
            System.out.println("Если возраст человека равен " + agePerson + ", то ему нужно ходить в школу ");
        } else if (agePerson >= 18 && agePerson <= 24) {
            System.out.println("Если возраст человека равен " + agePerson + ", то ему нужно ходить в университет ");
        } else {
            System.out.println("Если возраст человека равен " + agePerson + ", то ему нужно ходить на работу ");
        }
        //task5
        int ageKid = 12;
        if (ageKid <= 5) {
            System.out.println("Если возраст ребенка равен " + ageKid + ", то ему нельзя кататься на аттракционе");
        } else if (ageKid <= 14) {
            System.out.println("Если возраст ребенка равен " + ageKid + ", можно кататься на аттракционе в сопровождении");
        } else {
            System.out.println("Если возраст ребенка равен " + ageKid + ", без сопровождения взрослого");
        }
        //task 6
        int capacityInOneVan = 102;
        int seatsInOneVan = 60;
        int occupiedPlaces = 102;
        if (seatsInOneVan > occupiedPlaces) {
            System.out.println("сидячее место");
        } else if (occupiedPlaces == capacityInOneVan) {
            System.out.println("нет мест в вагоне");
        } else {
            System.out.println("стоячее место");
        }
        //task 7
        int one = 243;
        int two = 2123;
        int three = 24;
        if (one > two && one > three) {
            System.out.println(one);
        }
        if (two > one && two > three) {
            System.out.println(two);
        }
        if (three > two && three > one) {
            System.out.println(three);
        }
    }
}



