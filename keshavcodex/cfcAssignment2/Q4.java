package cfcAssignment2;

import java.util.Scanner;

public class Q4 {
    public static void reverse(long n){
        long temp=0;
        while(n != 0){
            temp = temp * 10 + n % 10;
            n /= 10;
        }
        System.out.println(temp);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer");
        long a = sc.nextInt();

        reverse(a);
    }
}
