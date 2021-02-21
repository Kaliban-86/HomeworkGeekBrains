package Homework9;
//       + Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4.
//       - При подаче массива другого размера необходимо бросить исключение MyArraySizeException.
//       + Далее метод должен пройтись по всем элементам массива, преобразовать в int и просуммировать.
//       - Если в каком-то элементе массива преобразование не удалось (например, в ячейке лежит символ или текст вместо числа),
//         должно бытьброшено исключение MyArrayDataException с детализацией, в какой именно ячейке лежат неверные данные.
//       - В методе main() вызвать полученный метод, обработать возможные исключения MyArraySizeException и MyArrayDataException
//         и вывести результат расчета.

public class Homework9 {
    public static final int ARR_X = 4;
    public static final int ARR_Y = 4;

    public static void main(String[] args) throws MyArraySizeException {

        String[][] str = {
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"},


        };


        System.out.println(arrTransformation(str));
    }

    public static int arrTransformation(String[][] arr) throws MyArraySizeException {
        if (arr.length != ARR_Y || arr[0].length != ARR_X || arr[1].length != ARR_X || arr[2].length != ARR_X || arr[3].length != ARR_X) {
            throw new MyArraySizeException();
        }

        int sum = 0;
        for (int i = 0; i < ARR_Y; i++) {
            for (int j = 0; j < ARR_X; j++) {
                sum = sum + Integer.parseInt(arr[i][j]);

            }
        }
        return sum;
    }
}
