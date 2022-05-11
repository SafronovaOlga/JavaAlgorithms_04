import java.util.Arrays;

public class NumberOccurrences {

    public int[][] getNumberOccurrences (int[] a) {
        if (a.length > 0) {
            Arrays.sort(a);
            int num = 0;

            for (int i = 0; i < a.length; i++) {
                for (int j = i + 1; j < a.length; j++) {
                    if (a[j] == a[i]) {
                       break;
                    } else {
                        num++;
                        break;
                    }
                }
            }
            int[][] result = new int[num + 1][2];
            num = 0;
            int count = 0;
            for (int i = 0; i < a.length; i+= count) {
                result[num][0] = a[i];
                count = 0;

                for (int j = 0; j < a.length; j++) {
                    if (a[j] == a[i]) {
                        count++;
                    }
                }
                result[num][1] = count;
                num++;
            }
            return result;
        }

        return new int[][]{};
    }
}
