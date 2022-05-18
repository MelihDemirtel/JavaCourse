import math.FourOperation;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Entry Your Name : ");
        String name = scanner.nextLine();
        System.out.println("Hello "+name);

        FourOperation fourOperation = new FourOperation();

        int result = fourOperation.summing(1,2,3,4,5);
        System.out.println(result);

    }
}
