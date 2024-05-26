package functions;

public class ReverseNumber {
    public static void reverse(int n){
//        1. using for loop

//    for (int i=0;i<=n;i++){
//        int lsd = n%10;
//        System.out.print(lsd);
//        n /= 10;
//    }
//        2. Using while loop

//        while(n>0){
//            int last_digit = n%10;
//            System.out.print(last_digit);
//            n = n/10;
//        }
//        System.out.println();
//        3. Using for loop
        int rev = 0;
        while (n>0){
            int lastDigit = n%10;
            rev = (rev*10)+lastDigit;
            n/=10;
        }
        System.out.println("reverse number is:"+rev);
    }
    public static void main(String[] args) {
    int n = 16092004;
    reverse(n);
    }
}