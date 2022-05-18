import math.FourOperation;
import math.Logarithm;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Entry Your Name : ");
        String name = scanner.nextLine();
        System.out.println("Hello "+name);

        FourOperation fourOperation = new FourOperation();

        int result = fourOperation.summing(1,2);
        System.out.println(result);

        Logarithm logarithm = new Logarithm();

        double result2 = logarithm.calculateLogarithm();
        System.out.println(result2);

    }
}
