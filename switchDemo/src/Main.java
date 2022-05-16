public class Main {

    public static void main(String[] args) {

        char grade = 'A';

        switch (grade) {
            case 'A':
                System.out.println("You Passed the Exam Your Score A");
                break;
            case 'B':
                System.out.println("You Passed the Exam Your Score B");
                break;
            case 'C':
                System.out.println("You Passed the Exam Your Score C");
                break;
            case 'D':
                System.out.println("You Passed the Exam Your Score D");
                break;
            case 'F':
                System.out.println("You Failed the Exam Your Score F");
                break;
            default:
                System.out.println("Invalid Grade Entry");
        }
    }
}
