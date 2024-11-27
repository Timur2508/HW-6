public class Main {
    public static void main(String[] args) {
        System.out.println("Домашняя работа");

        System.out.println("Задача №1");
        for (int i = 1; i <= 10; i = i + 1) {
            System.out.println("интерация цикла " + i);
        }
        System.out.println("Задача №2");
        for (int i = 10; i >= 1; i = i - 1) {
            System.out.println("интерация цикла " + i);
        }
        System.out.println("Задача №3");
        for (int i = 0; i <= 17; i = i + 2) {
            System.out.println("интерация цикла " + i);
        }
        System.out.println("Задача №4");
        for (int i = 0; i >= -10; i = i - 1) {
            System.out.println("интерация цикла " + i);
        }
        System.out.println("Задача №5");
        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println(i + "год является високосным ");
        }
        System.out.println("Задача №6");
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.println("итерация цикла " + i);
        }
        System.out.println("Задача №7");
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.println("интерация цикла " + i);
        }
        System.out.println("Задача №8");
        int salary = 29000;
        int total = 0;
        for (int i = 0; i <= 12; i++) {
            total = total + salary;
            System.out.println("Месяц " + salary + " сумма накоплений равна рублей " + total);
        }
        System.out.println("Задача №9");
        int salary1 = 29000;
        int total1 = 0;
        for (int i = 0; i <= 12; i++) {
            total1 = total1 + total1 / 120;
            total1 = total1 + salary1;
            System.out.println("Месяц " + salary1 + " сумма накоплений равна рублей " + total1);
        }
        System.out.println(total1);

        System.out.println("Задача №10");
        int multiplication = 2;
        int sum = 0;
        for (int i = 1; i <= 20; i = ++ i) {
            sum = sum + multiplication;
            System.out.println("2 * " + i + " = " + sum);
        }

    }
}
