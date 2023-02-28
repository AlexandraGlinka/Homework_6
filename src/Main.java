public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
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
}