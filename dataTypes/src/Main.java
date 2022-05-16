public class Main {

    public static void main(String[] args) {

        //1 byte memory used
        //The byte is an integer
        //The byte data type can hold between -128 to 127
        byte numberOne = 12;

        System.out.println(numberOne);

        //4 byte memory used
        //The int is an integer
        //The int data type can hold between -2147483648 to 2147483647
        int numberTwo = 12;

        System.out.println(numberTwo);

        //2 byte memory used
        //The short is an integer
        //The short data type can hold between -32768 to 32767
        short numberThree = 12;

        System.out.println(numberThree);

        //8 byte memory used
        //The long is an integer
        //The long data type can hold between -9223372036854775808 to 9223372036854775807
        long numberFour = 12;

        System.out.println(numberFour);

        //8 byte memory used
        //The double is a decimal
        //The double data type range is too high
        double numberFive = 12.5;

        System.out.println(numberFive);

        //2 byte memory used
        //The char is a character
        //The char data type is all unicode characters
        char character = 'a';

        System.out.println(character);

        //1 byte memory used
        //The boolean is a logic
        //The boolean data type is not applicable
        boolean logicOne = true;
        boolean logicTwo = false;

        System.out.println(logicOne);
        System.out.println(logicTwo);

    }
}
