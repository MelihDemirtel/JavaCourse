public class Main {

    public static void main(String[] args) {

        int numberOne = 25;
        int numberTwo = 2;
        int numberThree = 26;
        int largestNumber;
        int largestNumber2 = numberOne;

        if(numberOne > numberTwo) {
            largestNumber = numberOne;
            if (numberOne > numberThree) {
                largestNumber = numberOne;
                System.out.println("Largest Number is : " + largestNumber);
            }
        }
        if(numberTwo > numberOne){
            largestNumber = numberTwo;
            if(numberTwo > numberThree){
                largestNumber = numberTwo;
                System.out.println("Largest Number is : "+largestNumber);
            }
        }
        if(numberThree > numberOne){
            largestNumber = numberThree;
            if(numberThree > numberTwo){
                largestNumber = numberThree;
                System.out.println("Largest Number is : "+largestNumber);
            }
        }

        //Another Example

        if(largestNumber2 < numberTwo){
            largestNumber2 = numberTwo;
        }
        if(largestNumber2 < numberThree){
            largestNumber2 = numberThree;
        }

        System.out.println("Largest number is : "+largestNumber2);

    }
}
