package homework2;

public class Homework2 {
    public static void main(String[] args) {
        // Задать целочисленный массив, состоящий из элементов 0 и 1. С помощью цикла и условия заменить 0 на 1, 1 на 0;
        int[] arrOne = {0, 1, 0, 0, 0, 1, 1, 0, 1, 1};
        for (int i = 0; i < arrOne.length; i++) {
            if (arrOne[i] == 0) {
                arrOne[i] = 1;
                System.out.print(arrOne[i]);
            } else {
                arrOne[i] = 0;
                System.out.print(arrOne[i]);
            }
        }
        System.out.println();
        //___________________________________________________________________________________________________________
        //Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21
        int[] arrTwo = new int[8];
        for (int i = 0, j = 0; i < arrTwo.length; i++, j = j + 3) {
            arrTwo[i] = j;
            System.out.print(arrTwo[i]);
        }
        System.out.println();
        //___________________________________________________________________________________________________________
        //Задать массив [1,5,3,2,11,4,5,2,4,8,9,1] пройти по нему циклом, и числа меньшие 6 умножить на 2
        int[] arrThree = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arrThree.length; i++) {
            if (arrThree[i] < 6) {
                arrThree[i] *= 2;
            }
            System.out.print(arrThree[i]);
        }
        System.out.println();
        //_____________________________________________________________________________________________________________
        //Создать квадратный двумерный целочисленный массив, и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
        int[][] arrFour = new int[4][4];
        for (int i = 0; i < arrFour.length; i++) {
            for (int j = 0; j < arrFour.length; j++) {
                if (i == j) {
                    arrFour[i][j] = 1;
                    System.out.print(arrFour[i][j] + " ");
                } else {
                    arrFour[i][j] = 0;
                    System.out.print(arrFour[i][j] + " ");
                }
            }
            System.out.println();
        }
        //_____________________________________________________________________________________________________________
        //** Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);
        int[] arrFive = {3, 2, 3, 4, 7, 5, 6, 9, 1, 8};
        int max = arrFive[0], min = arrFive[0];
        for (int j : arrFive) {
            if (j >= max) {
                max = j;
            } else if (j <= min) {
                min = j;
            }
        }
        System.out.println("max= " + max + " min= " + min);
        //_____________________________________________________________________________________________________________
        //** Написать метод, в который передается не пустой одномерный целочисленный массив,
        // метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны.
        // Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true, checkBalance([1, 1, 1, || 2, 1]) → true,
        // граница показана символами ||, эти символы в массив не входят.

        int[] arrSix = {1, 1, 1, 1, 1, 1, 3, 3};
        System.out.println(checkBalance(arrSix));

        int[] arrSeven = {1, 0, 0, 0, 0};
        displacementArr(arrSeven, -2);
    }

    public static boolean checkBalance(int[] arr) {
        int sumLeft = 0;
        boolean bool = true;
        for (int i = 0; i < arr.length; i++) {
            int sumRight = 0;
            sumLeft = sumLeft + arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                sumRight = sumRight + arr[j];
            }
            if (sumLeft == sumRight) {
                bool = true;
                break;
            } else {
                bool = false;
            }
        }
        return bool;

    }//_________________________________________________________________________________________________________________
    //**** Написать метод, которому на вход подается одномерный массив и число n (может быть положительным, или отрицательным)
    //, при этом метод должен сместить все элементы массива на n позиций. Элементы смещаются циклично.
    // Для усложнения задачи нельзя пользоваться вспомогательными массивами.
    // Примеры: [ 1, 2, 3 ] при n = 1 (на один вправо) -> [ 3, 1, 2 ]; [ 3, 5, 6, 1]
    // при n = -2 (на два влево) -> [ 6, 1, 3, 5 ]. При каком n в какую сторону сдвиг можете выбирать сами.

    public static void displacementArr(int[] arr, int n) {
        if (n >= 0) {
            rightRotation(arr, n);
        } else {
            leftRotation(arr, n);
        }
    }

    private static void rightRotation(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            int rightEdge = arr.length - 1;
            int tempSt = arr[rightEdge];
            System.arraycopy(arr, 0, arr, 1, arr.length - 1);
            arr[0] = tempSt;
        }
        for (int k : arr) {
            System.out.print(k + " ");
        }
    }

    private static void leftRotation(int[] arr, int n) {
        n = n * n / (-n);
        for (int i = 0; i < n; i++) {
            int rightEdge = arr.length - 1;
            int tempSt = arr[0];
            System.arraycopy(arr, 1, arr, 0, arr.length - 1);
            arr[rightEdge] = tempSt;
        }
        for (int k : arr) {
            System.out.print(k + " ");
        }
    }
}

