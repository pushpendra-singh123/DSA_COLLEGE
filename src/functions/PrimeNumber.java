package functions;

import java.util.Scanner;
public class PrimeNumber {
//    public static void PrimeCheck(int n) {
//        if(n==2)
//            System.out.println("2 is prime");
//        else if (n == 0 || n == 1 || n<0) {
//            System.out.println("number is not prime.");
//        }
//        else {
//            boolean isPrime = true;
//            for (int i=2;i<=Math.sqrt(n);i++){
//                if (n % i == 0) {
//                    isPrime = false;
//                }
//            }
//            if (isPrime){
//                System.out.printf(n+ " is prime.");
//            }else {
//                System.out.printf(n+ " is not prime.");
//            }
//        }
//    }

    public static boolean PrimeCheck(int n) {
        if(n==2)
            return true;
        else if (n == 0 || n == 1 || n<0)
            System.out.println("number is not prime or not composite");
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
        System.out.println(PrimeCheck(n));

    }
}
