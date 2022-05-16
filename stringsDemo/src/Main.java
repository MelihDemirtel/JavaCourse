import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        String message = "Today is beautiful.";
        System.out.println(message);

        System.out.println("Number of Character : " + message.length());

        System.out.println("Fifth character : " + message.charAt(4));

        System.out.println(message.concat(" Amazing!"));

        System.out.println(message.startsWith("T"));

        System.out.println(message.endsWith("*"));

        char[] array = new char[5];
        message.getChars(0, 5, array, 0);
        System.out.println(array);

        System.out.println(message.indexOf('t'));

        System.out.println(message.lastIndexOf("t"));

        String newMessage = message.replace("a","*");
        System.out.println(newMessage);

        System.out.println(message.substring(6,19));

        for(String word:message.split(" ")){
            System.out.println(word);
        }

        System.out.println(message.toLowerCase());

        System.out.println(message.toUpperCase());

        System.out.println(message.trim());


    }
}
