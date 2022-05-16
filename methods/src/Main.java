public class Main {

    public static void main(String[] args) {
        findingNumber();

    }

    public  static void findingNumber(){
        int[] numbers = new int[]{1, 21, 35, 46, 58, 62, 77, 8, 9};
        int finding = 81;
        boolean isThere = false;

        for (int number : numbers) {
            if (finding == number) {
                isThere = true;
                break;
            }
        }
        if (isThere) {
            giveMessage("Number is found in array list : " + finding);
        } else {
            giveMessage("Number is not found in array list : " + finding);
        }
    }
    public static void giveMessage(String message){
        System.out.println(message);
    }
}