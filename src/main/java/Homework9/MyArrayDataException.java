package Homework9;

public class MyArrayDataException extends NumberFormatException{
   private  int x;
    private  int y;
    String massage;

    public MyArrayDataException(int y, int x){
        this.x = x;
        this.y = y;
        this.massage = "в массиве есть неверное значание в строке под номером " + y + " и столбце под номером " + x;
    }


}
