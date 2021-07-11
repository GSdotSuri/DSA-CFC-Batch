package cfcAssignment1;

import java.util.Scanner;

public class Q5_numOfDigit {
    public static void numOfDigit(int n){
        int count=0;
        while(n != 0){
            n /= 10;
            count++;
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        numOfDigit(n);
    }
}
