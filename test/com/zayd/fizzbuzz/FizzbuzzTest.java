package test.com.zayd.fizzbuzz;

import static org.junit.Assert.assertEquals;
import static com.zayd.fizzbuzz.Fizzbuzz.convert;

import org.junit.Test;

public class FizzbuzzTest {

    @Test
    public void normalNumberTest() {        
        assertEquals(convert("1"), "1");
        assertEquals(convert("2"), "2");
    }

    @Test
    public void divisibleByThreeGivesFizzTest() {
        assertEquals(convert("3"), "Fizz");
    }

    @Test
    public void divisibleByFiveGivesBuzzTest() {
        assertEquals(convert("5"), "Buzz");
    }

    @Test
    public void divisibleByThreeAndFiveGivesFizzBuzzTest() {
        assertEquals(convert("15"), "FizzBuzz");
    }
}
