import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList numbers = new ArrayList();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add("Ankara");

        System.out.println("Array List Size : "+numbers.size());

        System.out.println("Fourth Element of Array List : "+numbers.get(3));

        System.out.println("Changed First Index(1) of Array List With 100");
        numbers.set(0,100);
        System.out.println("First Index : "+numbers.get(0));

        System.out.println("Changed Fourth Index(Ankara) of Array List With Bursa");
        numbers.set(3,"Bursa");
        System.out.println("Fourth Index : "+numbers.get(3));

        System.out.println("Remove First index from Array List");
        numbers.remove(0);
        System.out.println("New Size of Array List : "+numbers.size());

        System.out.println("First Index of Array List : "+numbers.get(0));

        for(Object i : numbers){
            System.out.println(i);
        }

        System.out.println("Remove All Elements From Array List");
        numbers.clear();
        System.out.println("New Size of Array List : "+numbers.size());
    }
}
