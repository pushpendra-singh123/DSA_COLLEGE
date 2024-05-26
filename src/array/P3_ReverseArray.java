package array;

public class P3_ReverseArray {
    public static void reverseArray(int[] numbers){
        int start = 0, end = numbers.length-1;
        while (start < end){
            //swapping
            int temp = numbers[end];
            numbers[end] = numbers[start];
            numbers[start] = temp;

            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int[] numbers = {9,8,7,6,5,4};
        reverseArray(numbers);
        for (int i=0;i<numbers.length;i++){
            System.out.print(STR."\{numbers[i]} ");
        }
    }
}

