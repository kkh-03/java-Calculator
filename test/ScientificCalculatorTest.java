import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ScientificCalculatorTest {

    @Test
    void factorial() {
        ScientificCalculator calc = new ScientificCalculator();
        assertEquals(120, calc.factorial(5));
    }
}