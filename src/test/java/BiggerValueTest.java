import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BiggerValueTest {

    @Test
    public void testBiggerValueHappyPath () {

        int number1 = 3333;
        int number2 = 9999;
        int expectedResult = number2;

        BiggerValue biggerValue = new BiggerValue();
        int actualResult = biggerValue.getBiggerValue(number1,number2);

        Assertions.assertEquals(expectedResult,actualResult);

    }

    @Test
    public void testBiggerValueEqual () {

        int number1 = 3333;
        int number2 = 3333;
        int expectedResult = 0;

        BiggerValue biggerValue = new BiggerValue();
        int actualResult = biggerValue.getBiggerValue(number1,number2);

        Assertions.assertEquals(expectedResult,actualResult);

    }

    @Test
    public void testBiggerValueNegative () {

        int number1 = -3333;
        int number2 = -9999;
        int expectedResult = number1;

        BiggerValue biggerValue = new BiggerValue();
        int actualResult = biggerValue.getBiggerValue(number1,number2);

        Assertions.assertEquals(expectedResult,actualResult);

    }

    @Test
    public void testBiggerValueZero () {

        int number1 = 0;
        int number2 = 9999;
        int expectedResult = number2;

        BiggerValue biggerValue = new BiggerValue();
        int actualResult = biggerValue.getBiggerValue(number1,number2);

        Assertions.assertEquals(expectedResult,actualResult);

    }
}
