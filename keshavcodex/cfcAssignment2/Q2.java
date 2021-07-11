package cfcAssignment2;

import java.util.Scanner;

public class Q2 {
    public static void ArithmeticOperation(float n1, float n2, char c){
        if (c == '*') {
            System.out.println(n1 * n2);
        } else if (c == '/') {
            System.out.println(n1 / n2);
        } else if (c == '%') {
            System.out.println(n1 % n2);
        } else if (c == '+'){
            System.out.println(n1 + n2);
        } else if (c == '-'){
            System.out.println(n1 - n2);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float n1 = sc.nextFloat();
        float n2 = sc.nextFloat();
        char c = sc.next().charAt(0);

        ArithmeticOperation(n1,n2,c);

    }
}
