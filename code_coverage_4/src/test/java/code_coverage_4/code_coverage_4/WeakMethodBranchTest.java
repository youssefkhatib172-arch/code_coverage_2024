package code_coverage_4.code_coverage_4;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class WeakMethodBranchTest {

    @Test
    public void T1_aPositive_ifTrue() {
        assertEquals("y=-10", WeakMethod.weakMethod(1)); // if TRUE
    }

    @Test(expected = ArithmeticException.class)
    public void T2_aZero_ifFalse_bugExposed() {
        WeakMethod.weakMethod(0); // if FALSE => division by zero => חושף תקלה
    }
}
