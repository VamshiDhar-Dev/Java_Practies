public class Maximum_Product_Array {
    public static int maxProduct(int array[]) {
        int sub1=1;
        int sub2=1;
        int mid=(array.length)/2;
        //first subarray
        for(int index=0;index<mid;index++){
            sub1*=array[index];
        }
        //secound subarray
        for(int index=mid;index<array.length;index++){
            sub2*=array[index];
        }
        return (sub1>=sub2)?sub1:sub2;
    }
    public static void main(String[] args) {
        // int array[]={2,3,-2,4};
        int array[]={-2,0,-1};
        System.out.println(maxProduct(array));
    }
}
