package Homework12;
//                Практическое задание
//        Необходимо написать два метода, которые делают следующее:
//         + 1) Создают одномерный длинный массив, например:
//             static final int SIZE = 10 000 000;
//             static final int HALF = size / 2;
//             float[] arr = new float[size].
//
//        + 2) Заполняют этот массив единицами.
//        + 3) Засекают время выполнения: long a = System.currentTimeMillis().
//        + 4) Проходят по всему массиву и для каждой ячейки считают новое значение по формуле:
//              arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
//
//
//        + 5) Проверяется время окончания метода System.currentTimeMillis().
//        + 6) В консоль выводится время работы: System.out.println(System.currentTimeMillis() - a).
//
//        Отличие первого метода от второго:
//        + Первый просто бежит по массиву и вычисляет значения.
//        -  Второй разбивает массив на два массива, в двух потоках высчитывает новые значения и потом склеивает
//          эти массивы обратно в один.
//
//        + Пример деления одного массива на два:
//          System.arraycopy(arr, 0, a1, 0, h);
//          System.arraycopy(arr, h, a2, 0, h).
//
//        + Пример обратной склейки:
//          System.arraycopy(a1, 0, arr, 0, h);
//          System.arraycopy(a2, 0, arr, h, h).
//
//          Примечание:
//          System.arraycopy() — копирует данные из одного массива в другой:
//          System.arraycopy(массив-источник, откуда начинаем брать данные из массива-источника, массив-назначение,
//          откуда начинаем записывать данные в массив-назначение, сколько ячеек копируем)
//          По замерам времени:
//        + Для первого метода надо считать время только на цикл расчета:
//          for (int i = 0; i < size; i++) {
//          arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
//          }
//        + Для второго метода замеряете время разбивки массива на 2, просчета каждого из двух массивов и склейки.

import java.util.Arrays;

public class Homework12 {
    public static void main(String[] args) {

        methodOne();
        methodTwo();


    }

    public static void methodOne() {
        final int SIZE = 1000000;
        float[] arr = new float[SIZE];

        Arrays.fill(arr, 1);

        long a = System.currentTimeMillis();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        System.out.println(System.currentTimeMillis() - a);
    }

    public static void methodTwo() {
        final int SIZE = 1000000;
        final int HALF = SIZE / 2;
        float[] arr = new float[SIZE];
        float[] arrHalf1 = new float[HALF];
        float[] arrHalf2 = new float[HALF];

        Arrays.fill(arr, 1);

        long a = System.currentTimeMillis();

        System.arraycopy(arr, 0, arrHalf1, 0, HALF);
        System.arraycopy(arr, HALF, arrHalf2, 0, HALF);

        for (int i = 0; i < arrHalf1.length; i++) {
            arrHalf1[i] = (float) (arrHalf1[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        for (int i = 0; i < arrHalf2.length; i++) {
            arrHalf2[i] = (float) (arrHalf2[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }

        System.arraycopy(arrHalf1, 0, arr, 0, HALF);
        System.arraycopy(arrHalf2, 0, arr, HALF, HALF);

        System.out.println(System.currentTimeMillis() - a);
    }
}
