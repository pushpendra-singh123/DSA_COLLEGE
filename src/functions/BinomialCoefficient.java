package functions;

public class BinomialCoefficient {
    public static int factorial(int n){
        int fact = 1;
        for (int i=0;i<n;i++){
            fact*=(n-i);
        }
        return fact;
    }
//    nCr = n!/r!(n-r)!
    public static int  binoCoeffient(int n , int r){
        int a = factorial(n);
        int b = factorial(r);
        int c = factorial((n-r));
        int nCr = a/(b*c);
        return nCr;
    }
    public static void main(String[] args) {
//        System.out.println(factorial(1));
        System.out.println(binoCoeffient(5,2));
    }
}
