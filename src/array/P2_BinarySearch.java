package array;

import java.util.Scanner;

public class P2_BinarySearch {
    /*  prerequisite - sorted arrays
     *  Agar sorted array given h tabhi isme binary search lagega.
     *  time complexity = O(log base2 (n)).
     */
    public static int binarySearch(int[] numbers, int key){
        int start = 0,end = numbers.length-1;

        while(start <= end){
            int mid = (start + end)/2;
            // Comparisons
            if (numbers[mid] == key)
                return mid;
            if (numbers[mid] < key)     // right side access
                start = mid+1;
            else
                end = mid-1;            // left side access
        }
        return -1;      // Not found

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of the Array: ");
        int size = sc.nextInt();
        int[] numbers = new int[size];
        System.out.print("Enter Elements : ");
        for (int i=0;i<size; i++){
            numbers[i] = sc.nextInt();
        }
        System.out.print("Enter key: ");
        int key = sc.nextInt();
        sc.close();
        System.out.println(binarySearch( numbers, key));
    }
}
