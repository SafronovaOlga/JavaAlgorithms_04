import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IntersectionTest {

    @Test
    public void testIntersectionHappyPath () {
        int[] array1 = {1, 2, 4, 5, 89};
        int[] array2 = {8, 9, 4, 2};
        int[] expectedResult = {2, 4};

        Intersection intersection = new Intersection();
        int[] actualResult = intersection.getIntersectionAlgorithm(array1, array2);

        Assertions.assertArrayEquals(expectedResult, actualResult);

    }

    @Test
    public void  testIntersectionHappyPathNegative () {
        int[] array1 = {1, 2, 4, 5, 8, 9};
        int[] array2 = {8, 9, -4, -2};
        int[] expectedResult = {8, 9};

        Intersection intersection = new Intersection();
        int[] actualResult = intersection.getIntersectionAlgorithm(array1,array2);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testIntersectionHappyPath2 () {
        int[] array1 = {1, 2, 4, 5, 89};
        int[] array2 = {8, 9, 45};
        int[] expectedResult = {};

        Intersection intersection = new Intersection();
        int[] actualResult = intersection.getIntersectionAlgorithm(array1,array2);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }


}
