public class Minimum_Maximum_Element{
    public static void Min_Max(int array[]) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int temp=0,temp1=0;
        for(int index=0;index<array.length;index++){
            if(array[index]<min){
                temp=array[index];
                array[index]=min;
                min=temp;
            }else if(array[index]>max){
                temp1=array[index];
                array[index]=max;
                max=temp1;
            }
            
        }
        System.out.println(max+" "+min);
    }
public static void main(String[] args) {
    int array[]={3, 5, 4, 1, 9};
    Min_Max(array);
}
}