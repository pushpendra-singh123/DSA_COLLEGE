package array;

public class P1_PrintLargestOrSmallestElement {
    public static void largestAndSmallestElement(int[] array){
        int largestElement = Integer.MIN_VALUE;
        for (int i=0; i<array.length;i++){
            if (largestElement < array[i]){
                largestElement = array[i];
            }
        }
        System.out.println("Largest element is : " + largestElement);
        int smallestElement = Integer.MAX_VALUE;
        for (int i=0; i<array.length;i++){
            if (smallestElement > array[i]){
                smallestElement = array[i];
            }
        }
        System.out.println("Smallest element is : " + smallestElement);
    }

    public static void main(String[] args) {
        int[] array = {45,50,60,75,90,3,7,103};
        largestAndSmallestElement(array);
    }
}
