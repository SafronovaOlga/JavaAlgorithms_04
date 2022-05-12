public class PeakElement {

    public int[] getPeakElement (int[] array) {

        int l = 0;

        for (int i = 0; i < array.length; i++) {
            if ( i == 0 && array[0] > array[1]) {
                l++;
            } else if (i > 0 && i < array.length - 1 && array[i] > array[i - 1]
                    && array[i] > array[i + 1]) {
                l++;
            } else if (array[array.length - 1] > array[array.length - 2]) {
                l++;
            }
        }

        int[] resultArray = new int[l];
        int k = 0;

        for (int i = 0; i < array.length; i++) {
            if (i == 0 && array[0] > array[1]) {
                resultArray[k] = array[0];
                k++;
            } else if (i > 0 && i < array.length - 1 && array[i] > array[i - 1]
                    && array[i] > array[i + 1]) {
                resultArray[k] = array[i];
                k++;
            } else if (array[array.length - 1] > array[array.length - 2]) {
                resultArray[k] = array[array.length - 1];
            }
        }

        return resultArray;

    }
}
