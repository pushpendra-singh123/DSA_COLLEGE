package array;

public class P5_PrintAllSubArrays {
    public static void SubArray(int[] numbers){
        int tsa = 0;
        for (int i=0; i<numbers.length;i++){
            for (int j=i;j<numbers.length;j++){
                for (int k=i;k<=j;k++){
                    System.out.print(numbers[k]+" ");
                }
                System.out.println();
                tsa++;
            }
            System.out.println();
        }
        System.out.println("Total Sub-arrays = "+ tsa);
    }
    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 8, 10};
        SubArray(numbers);
    }
}
