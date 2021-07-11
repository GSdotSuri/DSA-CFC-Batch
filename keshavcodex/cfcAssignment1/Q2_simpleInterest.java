package cfcAssignment1;

import java.util.Scanner;

public class Q2_simpleInterest {
    public static double simpleInterest(double amount, double rate, double time) {
        double si = amount * rate * time / 100;
        return si;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ammout, rate and time");
        double a = sc.nextDouble();
        double r = sc.nextDouble();
        double t = sc.nextDouble();

        double interest = simpleInterest(a, r, t);
        double totalAmmount = a + interest;
        System.out.println("Interest: " + interest + ", TotalAmmount: " + totalAmmount);

    }
}
