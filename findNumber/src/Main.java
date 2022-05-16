public class Main {

    public static void main(String[] args) {

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
            System.out.println("Number is found in array list : " + finding);
        } else {
            System.out.println("Number is not found in array list : " + finding);
        }
    }
}
