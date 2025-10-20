public class ScientificCalculator extends AdvancedCalculator {
    public long factorial(int n) {
        if (n < 0) {
            System.out.println("음수는 계산할 수 없습니다.");
            return 0;
        }

        if (n == 0) {
            return 1;
        }

        long result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
            return result;
        }

        return result;
    }
}
