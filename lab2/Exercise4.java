import java.util.Scanner;

public class Exercise4 {

    public static int countElement(int[] arr, int k) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == k) {
                count++;
            }
        }

        return count;
    }

    public static int[] createArray(int n){
        Scanner sc= new Scanner(System.in);
        int arr[]= new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();

        }
        sc.close();
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print ("enter number of element: ");
        int n= sc.nextInt();
        int arr[]=createArray(n);
        
        System.out.println();
        System.out.println("enter the value: ");
        int k= sc.nextInt();

        int result = countElement(arr, k);

        System.out.println(k + " appears " + result);
        sc.close();
    }
}