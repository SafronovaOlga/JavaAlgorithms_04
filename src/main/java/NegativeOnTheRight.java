public class NegativeOnTheRight {

    public int[] getNegativeOnTheRight (int[] a) {

        int[] result = new int[a.length];
        int count = result.length - 1;
        int count2 = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0) {
                result[count] = a[i];
                count--;
            } else if (a[i] > 0){
                result[count2] = a[i];
                count2++;
            }
        }

        return result;

    }
}
