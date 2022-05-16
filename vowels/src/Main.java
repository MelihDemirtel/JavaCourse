public class Main {

    public static void main(String[] args) {

        char letter = 'o';

        switch (letter) {
            case 'a':
            case 'ı':
            case 'o':
            case 'u':
                System.out.println("Character is bold");
                break;
            case 'e':
            case 'i':
            case 'ö':
            case 'ü':
                System.out.println("Character is tiny");
                break;
            default:
                System.out.println("Invalid Grade Entry");

        }
    }
}
