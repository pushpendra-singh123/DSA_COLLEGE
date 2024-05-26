package functions;

import java.util.Scanner;

public class DecimalToBinary {
    public static void decTobin(int decNum) {
        int myNum = decNum;
        int pow = 0;
        int binNum = 0;
        while (decNum > 0) {
            int lastDig = decNum % 2;
            binNum =  binNum + (lastDig * (int)Math.pow(10, pow));
            pow++;
            decNum /= 2;
        }
        System.out.printf("Binary of " + myNum + " : " + binNum);
    }

    public static void main(String[] args) {
        System.out.print("Enter decimal number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        decTobin(num);
        sc.close();
    }
}