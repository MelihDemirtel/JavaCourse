public class Main {

    public static void main(String[] args) {

        BaseCreditManager[] creditManagers = new BaseCreditManager[]{new TeacherCreditManager(), new AgricultureCreditManager()};

        for(BaseCreditManager creditManager:creditManagers){
            double result = creditManager.calculation(1000);
            System.out.println(result);
        }
    }
}
