package Homework14;

public class NotFourException extends Exception{
    String massage;
    public NotFourException(){
        this.massage = "В массиве нет 4!";
    }
}
