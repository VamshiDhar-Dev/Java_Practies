import java.util.Arrays;

public class Kth_Largest_Element {
    public static int name(int arr[],int k) {
        // int temp=0;
        // for(int index=0;index<=k;index++){
        //     temp=arr[index];
        //     arr[index]=arr[index+1];
        //     arr[index+1]=temp;
        // }
        // return arr[9-k-1];
        Arrays.sort(arr);
        return arr[arr.length-k];
    }
    public static void main(String[] args) {
        // int array[]={3,2,1,5,6,4};
        int array[]={3,2,3,1,2,4,5,5,6};
        int k=4;
        System.out.println( name(array,k));
        // System.out.println(array.length);
    }
}
