package cfcAssignment2;

import java.util.Scanner;

public class Q7 {
    public static int gcd(int a, int b){
        int min = Math.min(a, b);
        if(min == 0)    return 0;

        for (int i = min; i >= 1 ; i--) {
            if(a % i == 0 && b % i == 0){
                return i;
            }
        }
        return 0;
    }
    public static void Lcm(int a, int b){
        int multiplication = a * b;
        int Lcm = multiplication / gcd(a, b);
        System.out.println("Lcm: " + Lcm);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two Numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();

        Lcm(a, b);

    }
}
