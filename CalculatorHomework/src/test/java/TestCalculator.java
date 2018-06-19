import junit.framework.TestCase;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestCalculator {

    @Test
    public void calculatorCanAdd(){
        Calculator calculator = new Calculator(2, 3);
        assertEquals(5, calculator.add());
    }


    @Test
    public void calculatorCanSubtract(){
        Calculator calculator = new Calculator(10, 5);
        assertEquals(5, calculator.subtract());
    }

    @Test
    public void calculatorCanMultiply(){
        Calculator calculator = new Calculator(10, 5);
        assertEquals(50, calculator.multiply());
    }

    @Test
    public void calculatorCanDivide(){
        Calculator calculator = new Calculator(20, 4);
        assertEquals(5, calculator.divide());
    }
}
