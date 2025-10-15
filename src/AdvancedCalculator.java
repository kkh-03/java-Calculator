public class AdvancedCalculator extends Calculator {
   //계산기 v2.0 곱하기 기능 개발 완료
    // https://github.com/kkh-03/java-Calculator/issues/2

    @Override
    public int multiply()
    {
        result = num1*num2;
        return result;
    }
// 나눗셈 기능 개발 완료
    //https://github.com/kkh-03/java-Calculator/issues/3
    @Override
    public int divide()
    {
        result = num1 / num2;
        return result;
    }
}
