package array;

import java.util.Arrays;
import java.util.Scanner;

public class P8_KadaneApproach {
    /*
     *  In kadane's we don't take those -ve values that did the sum = 0.
     *  In starting the array will start with -ve number then you did currentSum = 0 and maxSum = 0.
     *
     *  ****  Homework "If all values are -ve than return -1 otherwise biggest integer".   ****
     */
    public static void kadaneNegative(int[] numbers){
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        int count = 0;
        int ele = 0;

        for (int element : numbers) {
            if (element < 0) {
                count++;
            }
//            if (ele < element){
//                ele = element;
//            }
        }
        if (count == numbers.length){
            System.out.println(STR."Max integer: \{Arrays.stream(numbers).max()}");
//            System.out.println(STR."Max integer: \{ele}");
        }
    }
    public static void kadanes(int[] numbers){
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;

        for (int i = 0; i < numbers.length; i++) {
            currentSum += numbers[i];
            if (currentSum < 0){
                currentSum = 0;
            }
            maxSum = Math.max(currentSum,maxSum);
        }
        System.out.println("Max subArray sum is: " + maxSum);
    }
    
    public static void main(String[] args) {
//        int[] numbers = {-2, -3, 4, -1, -2, 1, 5, -3};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your array size: ");
        int size = sc.nextInt();

        int[] numbers = new int[size];
        System.out.print("Enter numbers: ");
        for (int i = 0; i < size; i++) {
          numbers[i] = sc.nextInt();
        }

        kadaneNegative(numbers);
        kadanes(numbers);

    }
}
