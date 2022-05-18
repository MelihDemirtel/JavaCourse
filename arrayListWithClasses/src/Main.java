import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Customer> customers = new ArrayList<Customer>();

        Customer melih = new Customer(1,"Melih","Han");
        customers.add(melih);
        customers.add(new Customer(2,"Can","Kan"));
        customers.add(new Customer(3,"Demir","Tan"));

        customers.remove(melih);
        for(Customer customer:customers){
            System.out.println(customer.firstName);
        }
    }
}
