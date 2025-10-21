import java.math.BigInteger;

public class ScientificCalculator extends AdvancedCalculator {
    public BigInteger factorial(int n) {
        if (n < 0) {
            System.out.println("음수는 계산할 수 없습니다.");
            return BigInteger.ZERO;
        }

        if (n == 0) {
            return BigInteger.ONE;
        }

        BigInteger result = BigInteger.ONE;

        for (int i = 1; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }

        return result;
    }
}
