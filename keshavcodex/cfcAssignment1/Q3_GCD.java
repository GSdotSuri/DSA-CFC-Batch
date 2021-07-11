package cfcAssignment1;
import java.util.*;
import java.lang.Math;
public class Q3_GCD {
    public static void gcd(int a, int b){
        for (int i = Math.min(a, b) ; i > 0 ; i--) {
            if (a % i == 0 && b % i == 0) {
                System.out.println("The gcd is: "+i);
                break;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        gcd(a,b);

    }
}
