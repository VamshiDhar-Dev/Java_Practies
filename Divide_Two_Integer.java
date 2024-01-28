public class Divide_Two_Integer {
    public static  int divide(int dividend, int divisor) {
        // if(dividend<=0 && divisor<=0){
        //     return 
        // }
     return (int)dividend/divisor;
    }
    public static void main(String[] args) {
        int d1=7;
        int d2=-3;
        System.out.println(divide(d1, d2));
    }
}
