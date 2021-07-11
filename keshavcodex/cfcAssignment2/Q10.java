package cfcAssignment2;
import java.util.Scanner;


public class Q10 {

    public static int [] inputArray(){
        Scanner sc =new Scanner(System.in);

        System.out.print("Enter the size of arr: ");
        int n = sc.nextInt();
        int [] arr= new int[n];

        System.out.printf("Enter %d elements of arr: ",n);
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.printf("%d elements inserted Successfully.\n",n);
        return arr;
    }

    public static void isSorted(int[] arr){
        int min=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                System.out.println("Array is not sorted");
                return ;
            }
            min = arr[i];
        }
        System.out.println("Array is sorted");
    }

    public static void main(String[] args) {

        int[] arr = inputArray();
        isSorted(arr);
    }
}
