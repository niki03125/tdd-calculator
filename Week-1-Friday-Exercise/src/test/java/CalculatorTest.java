import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tdd.Calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {

    Calculator calculator = new Calculator();

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    public void addTest(){
        int result = calculator.add(2,3);
        assertEquals(5,result);
    }

    @Test
    public void subtractTest(){
        int result = calculator.substract(6,2);
        assertEquals(4,result);
    }
    @Test
    public void multiplyTest(){
        int result = calculator.multiply(3,3);
        assertEquals(9,result);
    }
    @Test
    public void divideTest(){
        int result = calculator.divide(10,2);
        assertEquals(5,result);
    }


}