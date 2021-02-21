package Homework9;

public class MyArraySizeException extends Exception {
    String massage;
    public MyArraySizeException() {
        this.massage = "Необходимо изменить размер массива на 4 х 4!";
    }
}
