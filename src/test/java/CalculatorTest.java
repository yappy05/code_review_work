import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    void add() {
        assertEquals(5, calculator.add(2, 3));
        assertEquals(-1, calculator.add(-2, 1));
        assertEquals(0, calculator.add(0, 0));
        assertEquals(10, calculator.add(7, 3));
    }

    @Test
    void dif() {
        assertEquals(1, calculator.dif(3, 2));
        assertEquals(-3, calculator.dif(2, 5));
        assertEquals(0, calculator.dif(0, 0));
        assertEquals(5, calculator.dif(5, 0));
    }

    @Test
    void div() {
        assertEquals(2, calculator.div(6, 3));
        assertEquals(-2, calculator.div(-6, 3));
        assertEquals(0, calculator.div(0, 1));

        // Test division by zero
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            calculator.div(1, 0);
        });
        assertEquals("Division by zero", exception.getMessage());
    }

    @Test
    void times() {
        assertEquals(6, calculator.times(2, 3));
        assertEquals(-6, calculator.times(-2, 3));
        assertEquals(0, calculator.times(0, 5));
        assertEquals(15, calculator.times(5, 3));
    }

    @Test
    void solver() {
        assertEquals(14, calculator.solver());
    }
}
