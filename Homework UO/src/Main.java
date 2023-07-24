public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int age = 15;
        if (age >= 18) {
            System.out.println("Если ваш возраст равен" + age + " , то вы совершеннолетний");
        } else {
            System.out.println("Если ваш возраст равен " + age + " вы не достигли совершеннолетия, нужно немного подождать");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int T = 17;
        if (T <= 5) {
            System.out.println("На улице " + T + " градусов, нужно надеть шапку");
        } else {
            System.out.println("На улице " + T + " градусов,  можно идти без шапки");
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int V = 65;
        if (V >= 60) {
            System.out.println("Если скорость " + V + " км/ч, то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + V + " км/ч, то можно ездить спокойно");
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int age = 15;
        if (age < 2) {
            System.out.println("Если ваш возраст " + age + " , то Вам нужно идти спать");
        } else {
            if (age >= 2 && age <= 6) {
                System.out.println("Если ваш возраст " + age + " , то Вам нужно идти в детский сад");
            } else if (age >= 7 && age <= 18) {
                System.out.println("Если ваш возраст " + age + " , то Вам нужно идти в школу");
            } else if (age > 18 && age <= 24) {
                System.out.println("Если ваш возраст " + age + " , то Вам нужно идти в универ");
            } else if (age > 24 && age <= 60) {
                System.out.println("Если ваш возраст " + age + " ,то иди работай");
            } else if (age > 60) {
                System.out.println("Если ваш возраст " + age + " ,то иди отдыхай, дед");
            }
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        int ageJunior = 3;
        if (ageJunior < 5) {
            System.out.println("Если возраст ребенка равен " + ageJunior + " ,то ему нельзя на аттракион");
        } else {
            if (ageJunior >= 5 && ageJunior < 14) {
                System.out.println("Если возраст ребенка равен " + ageJunior + " ,то ему можно на аттракион в сопроождении взрослого");
            } else {
                System.out.println("Если возраст ребенка равен " + ageJunior + " ,то ему можно на аттракион");
            }
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        int place = 10;
        int vagon = 102;
        int SittingPlase = 60;
        int StandingPlace = vagon - SittingPlase;
        if (place <= SittingPlase) {
            System.out.println("Поздравляем, вам досталось сидячее место");
        } else {
            if (place > SittingPlase && place <= vagon) {
                System.out.println("Вам досталось сидячее место");
            } else {
                System.out.println("Увы, вагон заполнен");
            }
        }
    }

    public static void task7() {
        System.out.println("Задача 7");
        int one = 5;
        int two = 10;
        int three = 7;
        if (one > two && one > three) {
            System.out.println("большее число " + one);
        } else if (two > one && two > three) {
            System.out.println("большее число " + two);
        } else if (three > one && three > two) {
            System.out.println("большее число " + three);
        }
    }
}