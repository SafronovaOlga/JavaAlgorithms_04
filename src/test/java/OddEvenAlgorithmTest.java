import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class OddEvenAlgorithmTest {


    @Test
    public void testOddEvenHappyPathNeg () {

        long number = -345;
        String expectedResult = "Odd";

        OddEvenAlgorithm oddEvenAlgorithm = new OddEvenAlgorithm();
        String actualResult = oddEvenAlgorithm.oddEvenAlgorithm(number);

        Assertions.assertEquals(expectedResult, actualResult);

    }


    @Test
    public void testOddEvenNegative () {

        long number = -2147483649L;
        String expectedResult = "Undefined";

        OddEvenAlgorithm oddEvenAlgorithm = new OddEvenAlgorithm();
        String actualResult = oddEvenAlgorithm.oddEvenAlgorithm(number);

        Assertions.assertEquals(expectedResult, actualResult);

    }


    @Test
    public void testOddEvenPositive () {

        long number = 2147483648L;
        String expectedResult = "Undefined";

        OddEvenAlgorithm oddEvenAlgorithm = new OddEvenAlgorithm();
        String actualResult = oddEvenAlgorithm.oddEvenAlgorithm(number);

        Assertions.assertEquals(expectedResult, actualResult);

    }

}
