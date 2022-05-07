import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IsPositiveNumberTest {

    @Test

    /**
     *  public void testIsPositiveNumberPos () {
     *
     *         int number = 555;
     *         boolean expectedResult = true;
     *
     *         IsPositiveNumber isPositiveNumber = new IsPositiveNumber();
     *         boolean actualResult = isPositiveNumber.getIsPositiveNumberTrue(number);
     *
     *         Assertions.assertTrue(actualResult);
     *     }
     */
    public void testIsPositiveNumbersPos () {
        int number = 555;
        boolean expectedResult = true;

        IsPositiveNumber isPositiveNumber = new IsPositiveNumber();
        boolean actualResult = isPositiveNumber.getIsPositiveNumberTrue(number);

        Assertions.assertTrue(actualResult);
    }

    @Test
    public void testIsPositiveNumbersZero () {
        int number = 0;
        boolean expectedResult = true;

        IsPositiveNumber isPositiveNumber = new IsPositiveNumber();
        boolean actualResult = isPositiveNumber.getIsPositiveNumberTrue(number);

        Assertions.assertTrue(actualResult);
    }

    @Test
    public void testIsPositiveNumbersNeg () {
        int number = -555;
        boolean expectedResult = false;

        IsPositiveNumber isPositiveNumber = new IsPositiveNumber();
        boolean actualResult = isPositiveNumber.getIsPositiveNumberTrue(number);

        Assertions.assertFalse(actualResult);
    }

}
