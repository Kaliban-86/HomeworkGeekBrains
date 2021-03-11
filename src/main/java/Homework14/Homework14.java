package Homework14;

//        + Написать метод, которому в качестве аргумента передается не пустой одномерный целочисленный массив.
//        + Метод должен вернуть новый массив, который получен путем вытаскивания из исходного массива элементов,
//          идущих после последней четверки.
//        + Входной массив должен содержать хотя бы одну четверку, иначе в методе
//          необходимо выбросить RuntimeException.
//        + Написать набор тестов для этого метода (по 3-4 варианта входных данных).
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
    public static void main(String[] args) {

        int[] arrToTest = {4, 6, 2, 2, 6, 4, 7, 1};

        System.out.println(Arrays.toString(afterFourArray(arrToTest)));

    }

    public static int[] afterFourArray(int[] arr) {

        int numberOfArrleftHalfEnd = 4;
        List<Integer> arrayList = new ArrayList<>();
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == numberOfArrleftHalfEnd) {
                count++;
            }
        }
        if (count == 0) throw new RuntimeException("В массиве нет элемента со значением 4");

        if (arr[arr.length - 1] == numberOfArrleftHalfEnd)
            throw new RuntimeException("В массиве последний элемент равен 4");

        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == numberOfArrleftHalfEnd) {
                for (int j = i + 1; j < arr.length; j++) {
                    arrayList.add(arr[j]);
                }
                break;
            }
        }

        int[] arr2 = new int[arrayList.size()];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = arrayList.get(i);
        }
        return arr2;
    }
}



