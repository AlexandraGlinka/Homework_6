public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
    }
    public static void task1 () {
        System.out.println("Задача 1");

        for (int i = 1; i <= 10; i++){
            System.out.println(i);
        }
    }

    public static void task2() {
        System.out.println("Задача 2");

        for (int k = 10; k > 0; k -= 1) {
            System.out.println(k);
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        // Выведите в консоль все четные числа от 0 до 17.

        for (int n = 0; n < 17; n++) {
            if (n % 2 == 0 && n != 0) {
                System.out.println(n);
            }
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        // Выведите в консоль все числа от 10 до −10 от бо́льшего числа к меньшему.

        for (int j = 10; j >= -10; j -= 1) {
            System.out.println(j);
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        // 1904 года до 2096 - високосные

        for (int y = 1904; y <= 2096; y++) {
            if ((y % 4 == 0 && y % 100 != 0) || y % 400 == 0) {
                System.out.println("Високосный год - " + y);

            }
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        // 7 14 21 28 35 42 49 56 63 70 77 84 91 98

        for (int t = 7; t <= 100; t += 7) {
            System.out.println(t);

        }
    }

    public static void task7() {
        System.out.println("Задача 7");
        // 1 2 4 8 16 32 64 128 256 512

        for (int f = 1; f <= 512; f = f * 2) {
            System.out.println(f);
        }
    }

    public static void task8() {
        System.out.println("Задача 8");
        /*Посчитайте с помощью цикла for сумму годовых накоплений,
        если каждый месяц вы будете откладывать по 29 000 рублей «в банку».
         Выведите сумму накоплений за каждый месяц в консоль в формате: «Месяц …,
         сумма накоплений равна … рублей».*/
        int money = 29_000;
        int total = 0;
        for (int i = 1; i <= 12; i++) {
            total += money;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " руб.");
        }
    }

    public static void task9() {
        System.out.println("Задача 9");
        /*Перепишите решение задачи выше при условии,
        что деньги вы откладывать будете не «в банку»,
        а в банк под проценты — 12% годовых. Выведите сумму накоплений
        за каждый месяц в консоль в формате: «Месяц …, сумма накоплений равна … рублей».*/
        int money = 29_000;
        int total = 0;
        for (int i = 1; i <= 12; i++) {
            total = total + total/100;
            total += money;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " руб.");
        }
    }
}