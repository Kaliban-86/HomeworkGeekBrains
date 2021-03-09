package Homework14;
//        + Написать метод, которому в качестве аргумента передается не пустой одномерный целочисленный массив.
//        + Метод должен вернуть новый массив, который получен путем вытаскивания из исходного массива элементов,
//          идущих после последней четверки.
//        + Входной массив должен содержать хотя бы одну четверку, иначе в методе
//          необходимо выбросить RuntimeException.
//        - Написать набор тестов для этого метода (по 3-4 варианта входных данных).
//          Вх: [ 1 2 4 4 2 3 4 1 7 ] -> вых: [ 1 7 ].
//
//        Написать метод, который проверяет состав массива из чисел 1 и 4. Если в нем нет хоть одной четверки или единицы,
//        то метод вернет false; Написать набор тестов для этого метода (по 3-4 варианта входных данных).
//        [ 1 1 1 4 4 1 4 4 ] -> true
//        [ 1 1 1 1 1 1 ] -> false
//        [ 4 4 4 4 ] -> false
//        [ 1 4 4 1 1 4 3 ] -> false

import Homework9.MyArraySizeException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Homework14 {
    public static void main(String[] args) throws NotFourException {

        int[] arrToTest = {0, 6, 2, 2, 6, 7, 7, 1};

        try {
            System.out.println(Arrays.toString(afterFourArray(arrToTest)));
        } catch (NotFourException e) {
            System.err.println(e.massage);
        }

    }

    public static int[] afterFourArray(int[] arr) throws NotFourException {

        int numberOfArrleftHalfEnd = 4;
        List<Integer> arrayList = new ArrayList<>();

        try {
            for (int i = arr.length - 1; arr[i] != numberOfArrleftHalfEnd; i--) {
                arrayList.add(arr[i]);
            }
        } catch (RuntimeException e) {
            throw new NotFourException();
        }

        int[] arr2 = new int[arrayList.size()];
        for (int i = arrayList.size() - 1, j = 0; j < arr2.length; i--, j++) {
            arr2[j] = arrayList.get(i);
        }
        return arr2;
    }
}
