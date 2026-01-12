package code_coverage_4.code_coverage_4;

import static org.junit.Assert.*;
import org.junit.Test;

public class Func2Test {

    @Test
    public void T1_branchTrue_pNotZero_shouldReturnExpectedString() {
        String out = Func2.func2(5.0f, 20.0f);
        assertEquals("p=15.00, q=1.33", out);
    }

    @Test
    public void T2_branchFalse_pZero_shouldProduceNonFiniteValue_bugIsExposed() {
        String out = Func2.func2(0.0f, 20.0f);

        String qPart = out.substring(out.indexOf("q=") + 2).trim();
        float q = Float.parseFloat(qPart);

        // התקלה: q לא סופי (Infinity/NaN) כאשר p==0
        assertFalse("Expected non-finite q (Infinity/NaN), got: " + out, Float.isFinite(q));
    }

}
