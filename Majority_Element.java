// import java.util.Arrays;

public class Majority_Element {
    public static void name(int[] nums) {
        int large = Integer.MIN_VALUE;
        int size = 0;
        for (int index = 0; index < nums.length; index++) {
            size = Math.max(large, nums[index]);
        }
        int array[] = new int[size];
        for (int index = 0; index < size; index++) {
            if (index == nums[index]) {
                array[index] = +1;
            }
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }

    public static void main(String[] args) {
        // int array[] = { 3, 2, 3 };
        int array[] = { 2, 2, 1, 1, 1, 2, 2 };
        name(array);

        

    }
}
