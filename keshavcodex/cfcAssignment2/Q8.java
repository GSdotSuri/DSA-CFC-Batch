package cfcAssignment2;

import java.util.Scanner;

public class Q8 {
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
    public static void multiPlesOf5(int[] arr){
        int count = 0;
        for (int i = 0; i < arr.length ; i++) {
            int n = arr[i];
            if(n != 0 && n % 5 == 0){
                count++;
            }
        }
        System.out.printf("%d multiples found.\n",count);
    }
    public static void main(String[] args) {

        int[] arr = inputArray();
        multiPlesOf5(arr);

    }
}
