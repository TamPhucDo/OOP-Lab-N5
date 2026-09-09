import java.util.Scanner;

public class Exercise7 {

    public static void square(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * arr[i];
        }
    }

    public static int[] createArray(int n, Scanner sc) {
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        return arr;
    }

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter " + n + " elements:");
        int[] arr = createArray(n, sc);

        System.out.println("Original array:");
        printArray(arr);

        square(arr);

        System.out.println("\nSquared array:");
        printArray(arr);

        sc.close();
    }
}