public class Exercise6 {

    public static int find(int arr[], int k) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == k) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};

        int k = 30;

        int result = find(arr, k);

        System.out.println("Index of " + k + ": " + result);
    }
}