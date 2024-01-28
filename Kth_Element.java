import java.util.*;
public class Kth_Element {
    public static int name(int arr[], int k) {
        Arrays.sort(arr);

        if(k==0){
            return arr[0];
        }else{

        
        return arr[0+k-1];
        }
    }

    public static void main(String[] args) {
// int array[]={7 ,10 ,4 ,3 ,20 ,15};
int array[]={7 ,10, 4, 20, 15};

int Kith=4;
System.out.println(name(array,Kith));
    }
}
