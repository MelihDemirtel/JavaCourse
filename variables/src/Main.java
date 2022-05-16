public class Main {

    public static void main(String[] args) {

        int numberOfStudent = 10;
        String message = "Number of Student : ";

        //Only use string
        System.out.println("Number of Student : 10");

        //Use string + variable
        System.out.println("Number of Student : " + numberOfStudent);

        //Use variable + string
        System.out.println(message + "10");

        //Use variable + variable
        System.out.println(message + numberOfStudent);
    }
}
