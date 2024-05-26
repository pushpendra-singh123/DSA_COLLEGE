package functions;

import java.util.Scanner;

public class PrintPrimeInRange {
    public static boolean PrimeCheck(int n) {
        if(n==2)
            return true;
        else if (n == 0 || n == 1 || n<0)
            return false;
        else {
            for (int i=2;i<=Math.sqrt(n);i++){
                if ( n % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            if(PrimeCheck(i)){
                System.out.print(i+" ");
            }
        }
    }
}
