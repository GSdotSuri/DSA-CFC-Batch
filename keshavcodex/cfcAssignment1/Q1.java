package cfcAssignment1;

import java.util.Scanner;

public class Q1 {
    public static void campusLeader(int credits){
        if (7500 <= credits) {
            System.out.println("Tera Leader");
        } else if (6000 <= credits && credits < 7500) {
            System.out.println("Gega leader");
        } else if (4500 <= credits && credits < 6000) {
            System.out.println("Mega leader");
        } else {
            System.out.println("Rising Star");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        campusLeader(n);
    }
}
