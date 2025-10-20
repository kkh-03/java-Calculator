public class ScientificCalculator extends AdvancedCalculator
{
public long Factorial(int n) {

    long result = 1;

    for (int i = 1; i <= n; i++) {
        result *= i;
    }
    if( n== 0){
        return 1;
    }
    if( n < 0) {
        System.out.println("음수는 계산할 수 없습니다.");
        return 0;
    }
    return result;
    }

}

}
