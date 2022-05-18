public class Main {

    public static void main(String[] args) {

        FemaleGameCalculator femaleGameCalculator = new FemaleGameCalculator();
        femaleGameCalculator.calculation();
        femaleGameCalculator.gameOver();

        GameCalculator gameCalculators = new FemaleGameCalculator();
    }
}
