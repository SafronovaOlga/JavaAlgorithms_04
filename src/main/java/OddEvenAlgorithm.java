public class OddEvenAlgorithm {
    public String oddEvenAlgorithm (long number) {
        String odd = "Odd";
        String even = "Even";
        String undefined = "Undefined";

        if (number <= 2147483647L && number >= -2147483647L) {
            if (number % 2 == 0) {

                return even;
            } else {

                return odd;
            }
        }

        return undefined;
    }
}
