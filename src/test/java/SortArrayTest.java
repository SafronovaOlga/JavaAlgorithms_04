import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SortArrayTest {

    @Test
    public void testSortArray () {

        int[] array = {4, 3, 7, 12, 5, 2, 9, 4, 12};
        int[] expectedResult = {2, 3, 4, 4, 5, 7, 9, 12, 12};

        SortArray sortArray = new SortArray();
        int[] actualResult = sortArray.getSortArrayAlgorithm(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);

    }
}
