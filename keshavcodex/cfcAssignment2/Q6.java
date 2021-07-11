package cfcAssignment2;

import java.util.Scanner;

public class Q6 {
    public static void  gcd(int a, int b){
        int min = Math.min(a, b);
        if(min == 0){
            System.out.println(Math.max(a, b));
            return;
        }
        for (int i = min; i >= 1 ; i--) {
            if(a % i == 0 && b % i == 0){
                System.out.println(i);
                break;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two Numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        gcd(a, b);
    }
}
