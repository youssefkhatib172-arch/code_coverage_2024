package code_coverage_4.code_coverage_4;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class Func1Test {
    @Test
    public void T1_xNotZero_yZero_shouldReturn0() {
        int actual = Func1.func1(5, 0, 10);
        assertEquals(0, actual);
    }

    @Test(expected = ArithmeticException.class)
    public void T2_xZero_yNotZero_shouldThrowArithmeticException() {
        Func1.func1(0, 5, 10);
    }
}
