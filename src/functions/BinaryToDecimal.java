package functions;

import java.util.Scanner;

public class BinaryToDecimal {
    public static void binTodec(int binNum){
        int myNum = binNum;
        int pow = 0;
        int decNum = 0;
        while (binNum>0){
            int lastDig = binNum % 10;
            decNum = (int) (decNum +(lastDig* ( Math.pow(2,pow))));
            pow++;
            binNum = binNum/10;
        }
        System.out.printf("decimal of " + myNum + " : "+ decNum);

    }
    public static void main(String[] args) {
        System.out.print("Enter binary number: ");
        Scanner sc = new Scanner(System.in);
        int binNum = sc.nextInt();
        binTodec(binNum);
    }
}
