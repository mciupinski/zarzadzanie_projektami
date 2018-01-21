import org.junit.Test;
import static org.junit.Assert.*;

public class CalcTest {
    @Test
    public void calcTest() {
        Integer a = 3;
        Integer b = 5;
        Integer result = 15;
        assertEquals(Calc.calculate(a, b), result);
    }

    @org.junit.Test
    public void generatorTest() {
        int q = 10;
        assertEquals(Calc.generateRandomNumbers(q).length, q);
    }

}