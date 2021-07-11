package cfcAssignment2;

import java.util.Scanner;

public class Q1 {
    public static void decimalToOctal(int n){
        int power=1, ans=0;
        while(n != 0){
            ans += power * (n % 8);
            power *= 10;
            n /= 8;
        }
        System.out.println(ans);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();

        decimalToOctal(n);
    }
}
