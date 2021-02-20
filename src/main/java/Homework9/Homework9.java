package Homework9;
//       + Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4.
//       - При подаче массива другого размера необходимо бросить исключение MyArraySizeException.
//       + Далее метод должен пройтись по всем элементам массива, преобразовать в int и просуммировать.
//       - Если в каком-то элементе массива преобразование не удалось (например, в ячейке лежит символ или текст вместо числа),
//         должно бытьброшено исключение MyArrayDataException с детализацией, в какой именно ячейке лежат неверные данные.
//       - В методе main() вызвать полученный метод, обработать возможные исключения MyArraySizeException и MyArrayDataException
//         и вывести результат расчета.

public class Homework9 {


    public static void main(String[] args) {

        String[][] str = new String[4][4];

        str[0][0] = "1";
        str[0][1] = "0";
        str[0][2] = "1";
        str[0][3] = "1";

        str[1][0] = "1";
        str[1][1] = "1";
        str[1][2] = "8";
        str[1][3] = "1";

        str[2][0] = "1";
        str[2][1] = "1";
        str[2][2] = "1";
        str[2][3] = "1";

        str[3][0] = "1";
        str[3][1] = "7";
        str[3][2] = "1";
        str[3][3] = "1";

        System.out.println(arrTransformation(str));
    }

    public static int arrTransformation(String[][] arr) {
        int sum = 0;
        for (String[] strings : arr) {
            for (int j = 0; j < arr.length; j++) {
                sum = sum + Integer.parseInt(strings[j]);

            }
        }
        return sum;
    }
}
