import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PeakElementTest {

    @Test
    public void testPeakElement () {

            int[] arr = {3, 2, 7, 5, 1, 9, 23, 1};
            int[] expectedResult = {3, 7, 23};

            PeakElement peakElement = new PeakElement();
            int[] actualResult = peakElement.getPeakElement(arr);

            Assertions.assertArrayEquals(expectedResult, actualResult);

        }

}
