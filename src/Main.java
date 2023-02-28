public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
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
}