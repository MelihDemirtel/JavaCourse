public class Main {

    public static void main(String[] args) {

        String message = "Today is beautiful";
        String newMessage = message.substring(0,2);
        System.out.println(newMessage);

        int number = sum(5,7);
        System.out.println(number);

        int total = sum2(1,2,3,4,5);
        System.out.println(total);

        String newMessage2 = giveCity();
        System.out.println(newMessage2);

    }

    public static void add(){
        System.out.println("Comment added");

    }

    public static void delete(){
        System.out.println("Comment deleted");


    }

    public static void update(){
        System.out.println("Comment updated");


    }

    public static int sum(int number1, int number2){
        return number1 + number2;
    }

    public static int sum2(int... numbers){
        int summing = 0;
        for(int number: numbers){
            summing += number;
        }
        return summing;
    }

    public static String giveCity(){
        return "Ankara";
    }

}
