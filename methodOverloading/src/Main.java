public class Main {

    public static void main(String[] args) {

        FourOperation fourOperation = new FourOperation();
        int result = fourOperation.Summing(2,4);
        System.out.println(result);

        int result2 = fourOperation.Summing(1,2,3);
        System.out.println(result2);

        int result3 = fourOperation.Summing(1,2,3,4,5);
        System.out.println(result3);
    }
}
