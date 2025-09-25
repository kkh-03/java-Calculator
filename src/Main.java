public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        calc.setNumbers(10,2);
        calc.add();
        calc.displayResult( "+");

        Calculator calc_sub = new Calculator();
        calc_sub.setNumbers(10,2);
        calc_sub.subtract();
        calc_sub.displayResult( "-");

        Calculator calc_mul = new Calculator();
        calc_mul.setNumbers(10,2);
        calc_mul.multiply();
        calc_mul.displayResult( "*");

      Calculator calc_div = new Calculator();
      calc_div.setNumbers(10,2);
      calc_div.divide();
      calc_div.displayResult( "/");


    }

}