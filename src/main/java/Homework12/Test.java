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

        System.arraycopy(arr, 0, new float[HALF], 0, HALF);
        System.arraycopy(arr, HALF, new float[HALF], 0, HALF);

        for (float v : a1) {
            System.out.print(v + " ");

        }
        System.out.println("второй массив");


        for (int i = 0; i < a1.length; i++) {
            System.out.print(a2[i]+ " ");
        }
    }
}
