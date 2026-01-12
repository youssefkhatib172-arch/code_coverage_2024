package code_coverage_4.code_coverage_4;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class WeakMethodStatementTest {

    @Test
    public void T1_aPositive_shouldCoverAllStatements_withoutFullBranch_andNoBug() {
        // a>0 => נכנסים ל-if, x=1, ואז 10/(1-2)= -10 => אין תקלה
        assertEquals("y=-10", WeakMethod.weakMethod(1));
    }
}
