public class Exercise9 {
    public static int thirdLargest(int[] arr) {
        int largest = arr[0];
        int secondLargest = arr[0];
        int thirdLargest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                thirdLargest = secondLargest;
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest) {
                thirdLargest = secondLargest;
                secondLargest = arr[i];
            } else if (arr[i] > thirdLargest) {
                thirdLargest = arr[i];
            }
        }

        return thirdLargest;
    }

    public static void main(String[] args) {
        int[] arr = {10, 5, 8, 20, 15};

        System.out.println(thirdLargest(arr));
    }
}
