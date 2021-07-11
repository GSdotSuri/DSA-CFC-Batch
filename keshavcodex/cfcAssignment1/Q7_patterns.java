package cfcAssignment1;

import java.util.Scanner;

public class Q7_patterns {
    public static void pattern7a(int n) {
        int nst = 1;
        for (int id = 1; id <= n; id++) {
            for (int cst = 1; cst <= nst; cst++) {
                System.out.print(" * ");
            }
            System.out.println();
            nst++;
        }
    }

    public static void pattern7b(int n) {
        int nst = 1;
        for (int id = 1; id <= n; id++) {
            for (int cst = 1; cst <= nst; cst++) {
                System.out.print(cst+" ");
            }
            System.out.println();

            nst++;
        }
    }

    public static void pattern7c(int n) {
        int nst = 1, nsp = n - 1;
        for (int id = 1; id <= n; id++) {
            for (int csp = 1; csp <= nsp; csp++) {
                System.out.print("   ");
            }
            for (int cst = 1; cst <= nst/2+1; cst++) {
                System.out.print(" "+cst+" ");
            }
            for (int cst = nst/2; cst > 0; cst--) {
                System.out.print(" "+cst+" ");
            }
            System.out.println();
            nsp--;
            nst += 2;
        }
    }
    public static void pattern7d(int n) {
        int id=1,  nst = 1, nsp = n - 1;
       while(id <= n){
           int csp =1;
           while(csp <= nsp){
               System.out.print("   ");
               csp++;
           }
           int cst=1;
           while(cst <= nst/2){
               int temp = cst-1+id;
               System.out.print("  "+temp);
               cst++;
           }
           while(cst > 0){
               int temp = cst-1+id;
               System.out.print("  "+temp);
               cst--;
           }
            System.out.println();
            id++;
            nsp--;
            nst+=2;
        }
    }
        static int forCombination(int n ,int r){
            int i = 1; int C = 1;
            while(i<=r){
                C = C*(n-i+1)/i;
                i++;
            }
            return C;
        }
    public static void pattern7e(int n){
        int id=1, nst=1, ans;
        System.out.println("1");
        while (id <= n) {
            int cst = 0;
            while (cst <= nst) {
                ans = forCombination(nst,cst);
                System.out.print(ans+" ");
                cst++;
            }
            System.out.println();
            id++;
            nst++;
        }
    }

    public static void pattern7f(int n){
        int id=1, nst=1, nsp=n-1;
        while (id <= 2*n-1) {
            int csp=1;
            while (csp <= nsp) {
                System.out.print(" ");
                csp++;
            }
            int cst=1;
            while (cst <= nst) {
                System.out.print("*");
                cst++;
            }
            System.out.println();
            id++;
            if (id <= n) {
                nsp--;
                nst+=2;
            }else{
                nsp++;
                nst-=2;
            }
        }
    }
    public static void pattern7g(int n){
        int id=1, nst=1, nsp=2*n-3;
        while (id <= 2 * n - 1) {
            int cst = 1;
            while (cst <= nst) {
                System.out.print("*");
                cst++;
            }
            cst--;
            int csp = 1;
            while (csp < nsp) {
                System.out.print(" ");
                csp++;
            }
            while (cst > 0) {
                System.out.print("*");
                cst--;
            }
            System.out.println();
            id++;
            if (id < n) {
                nst++;
                nsp -= 2;
            } else {
                nst--;
                nsp += 2;
            }
        }
    }
    public static void pattern7h(int n){
        int id=1, nst=n, nsp=0;
        while (id <= 2*n-1) {
            int cst=1;
            if(id==1 || id == 2*n-1){
                nst--;
                cst--;
            } else if (id == 2) {
                nst++;
            }
            while (cst <= nst) {
                System.out.print("*");
                cst++;
            }
            cst--;
            int csp=1;
            while (csp < nsp) {
                System.out.print(" ");
                csp++;
            }
            while (cst > 0) {
                System.out.print("*");
                cst--;
            }
            System.out.println();
            id++;

            if(id<=n) {
                nsp+=2;
                nst--;
            }else {
                nsp-=2;
                nst++;
            }
        }
    }
    public static void pattern7i(int n){
        int id=1, nst=n, nsp=n;
        while(id <= 2*n-1){
            int csp=n;
            while (csp > nsp) {
                System.out.print(csp+" ");
                csp--;
            }
            int cst=1;
            while (cst < nst) {
                System.out.print(nst + " ");
                cst++;
            }
                cst--;
            while (cst > 0) {
                System.out.print(nst+" ");
                cst--;
            }
            while(csp <= n){
                System.out.print(csp+" ");
                csp++;
            }
            System.out.println();
            id++;
            if(id<=n) {
                nst--;
                nsp--;
            }else{
                nst++;
                nsp++;
            }
        }
    }

    public static void allPattern(int n){
        pattern7a(n);
        pattern7b(n);
        pattern7c(n);
        pattern7d(n);
        pattern7e(n);
        pattern7f(n);
        pattern7g(n);
        pattern7h(n);
        pattern7i(n);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        allPattern(n);

    }
}