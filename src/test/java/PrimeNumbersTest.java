import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class PrimeNumbersTest {

    PrimeNumbers pn;

    @Before
    public void init(){
        pn = new PrimeNumbers();
    }
    @Test
    public void getPrimeNumber() {
        assertEquals(pn.getPrimeNumber(10).lastEntry().getKey(),Integer.valueOf(29));
    }

    @Test
    public void isPrime() {
        assertTrue(pn.isPrime(5));
    }
}