import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculTest {
    @Test
    void testAdd() {
        Calculator calc = new Calculator(6, 3);
        assertEquals(9, calc.summation());
    }

    @Test
    void testSubtraction() {
        Calculator calc = new Calculator(6,3);
        assertEquals(3,calc.subtraction());
    }

    @Test
    void testDivision() {
        Calculator calc = new Calculator(6,3);
        assertEquals(2,calc.division());
    }

    @Test
    void testDivisionByZero() {
        Calculator calc = new Calculator(6,0);
        assertEquals(0,calc.division());
    }

    @Test
    void testMultiplication() {
        Calculator calc = new Calculator(6,3);
        assertEquals(18,calc.multiplication());
    }

    @Test
    void testMultiplicationByZero() {
        Calculator calc = new Calculator(0,6);
        assertEquals(0,calc.multiplication());
    }

    @Test
    void testDegree() {
        Calculator calc = new Calculator(6,3);
        assertEquals(216,calc.degree());
    }

    @Test
    void testDegreeByZero() {
        Calculator calc = new Calculator(6,0);
        assertEquals(1,calc.degree());
    }

    @Test
    void testDegreeByZeroBase() {
        Calculator calc = new Calculator(0,6);
        assertEquals(0,calc.degree());
    }
}
