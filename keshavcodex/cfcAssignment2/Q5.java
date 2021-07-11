package cfcAssignment2;

import java.util.Scanner;

public class Q5 {
        public static void inverseNum(int n){
            int a = n, count = 0, temp = 0;
            while(a != 0){
                count++;
                a /= 10;
            }
            int[] arr = new int[count];

            for (int i = 0; i < arr.length; i++) {
                arr[(n % 10) - 1] = count--;
                n /= 10;
            }
            for (int ele: arr) {
                temp = temp * 10 + ele;
            }
            System.out.println(temp);
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        inverseNum(n);
    }
}
