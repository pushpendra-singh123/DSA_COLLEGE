package array;

public class P6_PrintSumOfSubArrays {
    /*  This is Bruteforce approach.
     *  its time complexity is O(n^3)
     */
    public static void maxSubArraySum(int[] numbers){
//        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;

        for (int i=0;i<numbers.length;i++){
            for (int j=i;j<numbers.length;j++){
                currentSum = 0;
                for (int k=i;k<=j;k++){
                  currentSum += numbers[k];
                }
                System.out.println(currentSum);
                if (maxSum < currentSum){
                    maxSum = currentSum;
                }
            }
        }
        System.out.println("Max Sum = "+ maxSum);
    }
    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 8, 10};
        maxSubArraySum(numbers);
    }
}
