public class Main {

    public static void main(String[] args) {

        //Long Way
        String student1 = "Jack";
        String student2 = "Mai";
        String student3 = "Adam";

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);

        System.out.println("----------------------");

        //String[] students = new String[Number of Elements "MAX"];
        String[] students = new String[3];

        students[0]="Jack";
        students[1]="Mai";
        students[2]="Adam";

        for(int i = 0; i < students.length; i++){
            System.out.println(students[i]);
        }

        System.out.println("----------------------");

        //Another Example
        for (String student:students){
            System.out.println(student);
        }

    }
}
