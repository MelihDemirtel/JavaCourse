public class Main {

    public static void main(String[] args) {

        try{
            int[] numbers = new int[]{1,2,3};
            System.out.println(numbers[5]);
        }catch (ArrayIndexOutOfBoundsException exception){
            System.out.println(exception);
        }catch (StringIndexOutOfBoundsException exception){
            System.out.println(exception);
        }catch (Exception exception){
            System.out.println("Logged : "+exception);
        }
        finally {
            System.out.println("This block always runs");
        }
    }
}
