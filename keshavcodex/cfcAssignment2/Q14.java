package cfcAssignment2;

import java.util.Scanner;

public class Q14 {
    static Scanner sc =new Scanner(System.in);
    static void swap(int[] arr, int n1, int n2){
        int temp = arr[n1];
        arr[n1] = arr[n2];
        arr[n2] = temp;
    }
    public static int [] inputArray(){

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
        public static void pair(int[] arr, int target){
            int a, b;
            for (int i = 0; i < arr.length; i++) {
                a = arr[i];
                for (int j = i+1; j < arr.length; j++) {
                    b = target - a;
                    if (b == arr[j]) {
                        System.out.printf("(%d,%d) ", a, b);
                        arr[j]=target;
                    }
                }
            }
        }
    public static void main (String[] args){

//        int[] arr = inputArray();
        int[]arr = { 0, -1 , -1 , 1, 0 , 0 };
        System.out.println("Enter the target value");
        int target=sc.nextInt();

        pair(arr, target);
    }
}
