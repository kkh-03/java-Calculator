import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        calc.setNumbers(10, 2);
        calc.add();
        calc.displayResult("+");
        calc.subtract();
        calc.displayResult("-");

        AdvancedCalculator calc_mul = new AdvancedCalculator();
        calc_mul.setNumbers(10, 2);
        calc_mul.multiply();
        calc_mul.displayResult("*");

        AdvancedCalculator calc_div = new AdvancedCalculator();
        calc_div.setNumbers(10, 2);
        calc_div.divide();
        calc_div.displayResult("/");

    ScientificCalculator calc_fac = new ScientificCalculator();
    int n = 50;
    BigInteger fac = calc_fac.factorial(n);
        System.out.println(n +"! = "+fac);
    }
}