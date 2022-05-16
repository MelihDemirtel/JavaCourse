public class Main {

    public static void main(String[] args) {

        double[] myList = {1.1, 2.1, 3.1, 4.1};
        double total = 0;
        double largest = myList[0];

        for (double number : myList) {
            if (largest < number) {
                largest = number;
            }
            total = total + number;
            System.out.println(number);
        }
        System.out.println("Total = " + total);
        System.out.println("Largest number = " + largest);

        System.out.println("-----------------");
        //Another Example
        if (largest < myList[1]) {
            largest = myList[1];
        }
        if (largest < myList[2]) {
            largest = myList[2];
        }
        if (largest < myList[3]) {
            largest = myList[3];
        }
        System.out.println("Largest number = " + largest);
    }
}
