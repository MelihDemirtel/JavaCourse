public class Main {

    public static void main(String[] args) {

        int number = 1;
        int remainder = number % 2;
        System.out.println("Remainder : " + remainder);
        boolean isPrime = true;

        if(number == 1){
            System.out.println("Number is not Prime");
            return;
        }
        if(number < 1){
            System.out.println("Invalid Number");
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
            }

        }

        if (isPrime) {
            System.out.println("Number is Prime");
        } else {
            System.out.println("Number is not Prime");
        }
    }
}
