package functions;

public class FunctionOverloding{
    public static int sum(int a, int b, int c){
        return a+b+c;
    }
    public static float sum(float a,float b,float c){
        return a+b+c;
    }
    public static double sum(double a,double b,double c){
        return a+b+c;
    }
    public static void main(String[] args) {

//        multiple functions with the same name but different parameters.(different data types or by increasing parameters.

        int intSum = sum(4,5,6);
        float fSum = sum(4.0f,5.0f,6.0f);
        double dSum = sum(4d,5d,6d);
        System.out.println(intSum);
        System.out.println(fSum);
        System.out.println(dSum);
    }
}