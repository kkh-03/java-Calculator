public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        calc.setNumbers(10,2);
        calc.add();
        calc.displayResult( "+");

        AdvancedCalculator calc_mul = new AdvancedCalculator();
        calc_mul.setNumbers(10,2);
        calc_mul.multiply();
        calc_mul.displayResult( "*");
    }

}