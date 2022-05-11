import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SumOfTwoTest {

    @Test
    public void testSumOfTwoHappyPath () {
        int[] array = {4, 3, 7, 12, 5, 2, 9, 4, 12};
        int sum = 12;
        int[][] expectedResult = {{3, 9}, {7, 5}};

        SumOfTwo sumOfTwo = new SumOfTwo();
        int[][] actualResult = sumOfTwo.getSumOfTwoAlgorithm(array, sum);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

}
