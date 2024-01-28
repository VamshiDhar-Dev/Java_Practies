public class Maximum_Sub_Array {
    public static int name(int arr[]) {
        int result=0;
        for(int index=0;index<(arr.length/2);index++){
            result+=arr[index];

        }
        return result;
    }
    public static void main(String[] args) {
        int array[]={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(name(array));
    }
}
