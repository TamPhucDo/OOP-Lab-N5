import java.util.Scanner;

public class Exercise1 {
    public static int findMax(int arr[]) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    public static int[] createArray(int n){
        int arr[]=new int[n];
        Scanner sc= new Scanner(System.in);
        
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();

        }
        sc.close();
        return arr;
        
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number of elements:");
        int n= sc.nextInt();
        int arr[]= createArray(n);
        System.out.println("The max num: " + findMax(arr));
        sc.close();
    }
}