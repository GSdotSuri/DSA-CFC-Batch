package cfcAssignment2;

import java.util.*;

public class Q11 {

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
    public static void sortZeroOne(int [] arr){
        int count0 = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i]==0)   count0++;
        }

        for(int i = 0; i<count0; i++){
            arr[i] = 0;
        }
        for(int i = count0; i < arr.length ; i++){
            arr[i] = 1;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr = inputArray();
        sortZeroOne(arr);
    }
}
