package Homework12;

public class Test {
    public static void main(String[] args) {
        final int SIZE = 10;
        final int HALF = SIZE / 2;
        float[] arr = new float[SIZE];
        float[] a1 = new float[HALF];
        float[] a2 = new float[HALF];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }

        System.arraycopy(arr, 0, a1, 0, HALF);
        System.arraycopy(arr, HALF, a2, 0, HALF);

        for (float v : a1) {
            System.out.print(v + " ");

        }
        System.out.println();
        System.out.println("второй массив");

        for (int i = 0; i < a1.length; i++) {
            System.out.print(a2[i]+ " ");
        }
        System.arraycopy(a1, 0, arr, 0, HALF);
        System.arraycopy(a2, 0, arr, HALF, HALF);

        System.out.println();
        System.out.println("третий массив");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
    }
}
