public class Exercise4 {
    public static int countElements(int[] arr, int target) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                count++;
            }
        }
        return count;
    }
    public static void printArr(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(); 
    }

    public static void main(String[] args) {
        int[] numbers = {3, 5, 2, 5, 9, 5, 1};
        int targetNumber = 5;
        
        int occurrences = countElements(numbers, targetNumber);
        printArr(numbers);
        System.out.println("Looking for: " + targetNumber);
        System.out.println("Count: " + occurrences); 
    }
}