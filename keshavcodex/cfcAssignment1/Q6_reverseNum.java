package cfcAssignment1;

import java.util.Scanner;

public class Q6_reverseNum {
    public static void reversenum(int n){
        int reverse=0;
        while(n != 0){
            reverse=(reverse*10) + (n%10);
            n/=10;
        }
        System.out.println(reverse);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to reverse");
        int n=sc.nextInt();
        reversenum(n);
    }
}
