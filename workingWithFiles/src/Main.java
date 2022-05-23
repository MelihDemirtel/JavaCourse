import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        getFileInfo();
        readFile();
        writeFile();
        readFile();

    }

    public static void createFile(){
        File file = new File("C:\\Users\\ext02d47194\\Desktop\\JavaCourse\\files\\students.txt");

        try {
            if(file.createNewFile()){
                System.out.println("File Created");
            }else{
                System.out.println("The File Has Already Been Created");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void getFileInfo(){
        File file = new File("C:\\Users\\ext02d47194\\Desktop\\JavaCourse\\files\\students.txt");
        if(file.exists()){
            System.out.println("File's Name : "+file.getName());
            System.out.println("File's Path : "+file.getAbsolutePath());
            System.out.println("File's Can Write : "+file.canWrite());
            System.out.println("File's Can Read : "+file.canRead());
            System.out.println("File's (byte) : "+file.length());

        }
    }

    public static void readFile(){
        File file = new File("C:\\Users\\ext02d47194\\Desktop\\JavaCourse\\files\\students.txt");
        try {
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()){
                String line = reader.nextLine();
                System.out.println(line);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void writeFile(){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\ext02d47194\\Desktop\\JavaCourse\\files\\students.txt",true));
            writer.newLine();
            writer.write("Ahmet");
            System.out.println("Created in File");
            writer.close();
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
