public class basic {
    public static int[] name(int nums[]) {
        int array[]=new int[2];
        int j=0;
     for(int i=0;i<nums.length;i++){
        if(nums[i]%2==0){
            array[j]=nums[i];
            j++;
        }
        
     }   
     return array;
    }
    public static void main(String[] args) {
        
        int array[]={1,2,3,4};
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]);
        }
        System.out.println();
        int arr[]=name(array);
        for(int index=0;index<arr.length;index++){
            System.out.println(arr[index]);
        }

    }
}