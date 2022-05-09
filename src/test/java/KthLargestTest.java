import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class KthLargestTest {

    @Test
    public void testKthLargest () {
        int[] array = {4, 3, 7, 12, 5, 2, 9, 4, 12};
        int k = 3;
        int expectedResult = 9;

        KthLargest kthLargest = new KthLargest();
        int actualResult = kthLargest.getKthLargestAlgorithm(array, k);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
