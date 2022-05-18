import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> cities = new ArrayList<String>();
        cities.add("Ankara");
        cities.add("İstanbul");
        cities.add("Bursa");
        cities.add("Konya");
        cities.add("Adana");

        cities.remove("İstanbul");

        Collections.sort(cities);

        for (String city:cities){
            System.out.println(city);
        }


    }
}
