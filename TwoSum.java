public class TwoSum {
    public static int[] name(int[] nums,int target) {
        int index1=0;
        int index2=0;
        int sum=0;
        int copy[]=new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                sum=nums[i] +nums[j];
                if(target==sum){
                    index1=i;
                    index2=j;
                }              
            }
        }
        copy[0]=index1;
        copy[1]=index2;
        return copy;
    }
    public static void main(String[] args) {
        int array[]={2,7,11,15};
// int array[]={3,3};
        int nums[]=name(array, 26);
        for(int i=0;i<nums.length;i++){
            System.out.println(nums[i]);
        }

    }
}
