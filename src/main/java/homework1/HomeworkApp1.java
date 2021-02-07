package homework1;

public class HomeworkApp1 {
    public static void main(String[] args) { // Создать метод main

        //Создать переменные всех пройденных типов данных и инициализировать их значения
        byte a = 8;
        short b = 16;
        short c = 16;
        long d = 64L;
        float i = 3.2f;
        double f = 0.64;
        char g = 16;
        boolean bool = true;

        // метод вычисляющий a * (b +(c/d)) и возвращающий результат, переменные типа float
        System.out.println(methodOne(2f, 3f, 30f, 15f));

        // метод принимающий два числа и определеяющий нахождение их суммы в пределах от 10 до 20, выводящий true или false
        System.out.println(methodTwo(17, 2));

        // метод печатающий в консоль положительное число или отрицательное
        methodThree(-8);

        // метод принимающий число и возвращающий true если число отрицательное и false  если положительное
        System.out.println(methodFor(-1));

        // метод принимающий строку и выводящий в консоль "Привет, укзанное имя"
        methodFive("Андрей Сулыз");

        // метод определяет тип года (високосный/ не високосный)
        methodSix(2104);
    }

    public static float methodOne(float a, float b, float c, float d) {
        return a * (b + (c / d));
    }

    public static boolean methodTwo(int a, int b) {
        boolean bool;
        bool = (a + b) >= 10 && (a + b) <= 20;
        return bool;
    }

    public static void methodThree(int a) {
        if (a >= 0) {
            System.out.println("Число положительное.");
        } else {
            System.out.println("Число отрицательное.");
        }
    }

    public static boolean methodFor(int a) {
        boolean bool;
        bool = a < 0;
        return bool;
    }

    public static void methodFive(String name) {
        System.out.println("Привет," + name + "!");
    }

    public static void methodSix(int a) {
        if (((a % 400) + (a % 100)) == 0 || ((a % 4) == 0) && (a % 100) != 0) {
            System.out.println("Високосный год!");
        } else {
            System.out.println("Не високосный год!");
        }
    }
}
