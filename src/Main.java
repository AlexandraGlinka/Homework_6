public class Main {
    public static void main(String[] args) {
        task1();
        task2();
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
}