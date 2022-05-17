public class Main {

    public static void main(String[] args) {

        BaseCreditManager[] creditManagers = new BaseCreditManager[]{new TeacherCreditManager(), new AgricultureCreditManager(),new StudentCreditManager()};

        for(BaseCreditManager creditManager:creditManagers){
            double result = creditManager.calculation(1000);
            System.out.println(result);
        }
    }
}
