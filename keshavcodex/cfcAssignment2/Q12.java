package cfcAssignment2;

import java.util.Arrays;

public class Q12 {
    static void swap(int[] arr, int n1, int n2) {
        int temp = arr[n1];
        arr[n1] = arr[n2];
        arr[n2] = temp;
        System.out.println("i: "+n1+", a: "+n2);
    }
    static boolean isEven(int a){
        if((a & 1) == 0){
            return true;
        }
        return false;
    }
    public static void sortOddEven(int[] arr){
        int evenCount=0;
        for (int i = 0; i < arr.length ; i++) {
            if (isEven(arr[i])) {
                evenCount++;
            }
        }

    }
    public static void main(String[] args) {
        int[] arr= {3,8,5,13,6,12,17,51,48548,83,4461,158};
        System.out.println(Arrays.toString(arr));
        sortOddEven(arr);
        System.out.println(Arrays.toString(arr));
        //Wrong answer
        //Wrong answer
    }
}
