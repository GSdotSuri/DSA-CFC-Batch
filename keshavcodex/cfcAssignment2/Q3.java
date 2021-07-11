package cfcAssignment2;

import java.util.Scanner;

public class Q3 {
    public static void CharacterDetection(char c){
        if (c >= 65 && c <= 90) {
            System.out.println("Uppercase");
        } else if (c >= 97 && c <= 122) {
            System.out.println("Lowercase");
        } else {
            System.out.println("Not an alphabate");
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char c = sc.next().charAt(0);

        CharacterDetection(c);

    }
}
