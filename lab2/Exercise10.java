import java.math.BigDecimal;

public class Exercise10 {
    public static BigDecimal findMax(BigDecimal[] arr) {
        BigDecimal max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i].compareTo(max) > 0) {
                max = arr[i];
            }
        }

        return max;
    }

    public static void main(String[] args) {

        BigDecimal[] arr = {
            new BigDecimal("10.5"),
            new BigDecimal("25.75"),
            new BigDecimal("8.2"),
            new BigDecimal("100.25"),
            new BigDecimal("50.5")
        };

        BigDecimal max = findMax(arr);

        System.out.println("Maximum value: " + max);
    }
}
