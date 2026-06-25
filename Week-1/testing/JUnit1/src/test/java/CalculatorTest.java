import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void testSubtraction(){
        int res = 2-4;
        assertEquals(-2,res);
    }
}
