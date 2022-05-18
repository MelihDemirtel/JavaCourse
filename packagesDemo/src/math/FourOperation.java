package math;

public class FourOperation {
    public int summing(int number1, int number2){
        return number1 + number2;
    }

    public int summing(int... numbers){
        int total = 0;
        for(int number:numbers){
            total+=number;
        }
        return total;
    }
}
