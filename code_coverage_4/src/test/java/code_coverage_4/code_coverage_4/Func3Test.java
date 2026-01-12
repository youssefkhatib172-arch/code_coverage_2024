package code_coverage_4.code_coverage_4;

import org.junit.Test;

public class Func3Test {

    @Test(expected = ArithmeticException.class)
    public void T1_anyInput_shouldThrowArithmeticException() {
        Func3.func3(1);
    }
}
