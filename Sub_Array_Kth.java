public class Sub_Array_Kth {
    public static int name(int arr[],int k) {
    int sum=0;
    for(int index=0;index<arr.length;index++){
        if(index==0||index==arr.length-1){
            // sum+=arr[index];
            continue;
        }else{
            sum+=arr[index];
        }
    }
    return sum/3;

        
    }
    public static void main(String[] args) {
        int array[]={ 2, 7, 6, 1, 4, 5 };
        // int array[]={-2, 2, -5, 12, -11, -1, 7};
        System.out.println(name(array, 3));
    }
}
