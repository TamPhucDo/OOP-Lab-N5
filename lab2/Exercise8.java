public class Exercise8 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};

        int[] result = divisibleNumbers(arr, 2);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
    
    public static int[] divisibleNumbers(int[] arr, int k) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % k == 0) {
                count++;
            }
        }

        int[] result = new int[count];

        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % k == 0) {
                result[index] = arr[i];
                index++;
            }
        }

        return result;
    }
}
