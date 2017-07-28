import static org.junit.Assert.*;
import org.junit.Test;

public class PrimeTest {
    @Test
    public void testCase1() throws Exception {
        Prime primeNumber = new Prime();
        int expected = 3;
        int actual = primeNumber.primeNumber(2);
        assertEquals("TestCase 1 Failed", expected, actual);

    }

    @Test
    public void testCase2() throws Exception {
        Prime primeNumber = new Prime();
        int expected = 5;
        int actual = primeNumber.primeNumber(3);
        assertEquals("TestCase 2 Failed", expected, actual);

    }

    @Test
    public void testCase3() throws Exception {
        Prime primeNumber = new Prime();
        int expected = 7;
        int actual = primeNumber.primeNumber(4);
        assertEquals("TestCase 3 Failed", expected, actual);

    }

    @Test
    public void testCase4() throws Exception {
        Prime primeNumber = new Prime();
        int expected = 11;
        int actual = primeNumber.primeNumber(5);
        assertEquals("TestCase 4 Failed", expected, actual);
    }
}