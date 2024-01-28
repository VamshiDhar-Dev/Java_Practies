public class Reverses_Array {
    public static void printReverse(int arr[]) {
        for (int index = arr.length - 1; index >=0; index--) {
            System.out.println(arr[index]);
        }
    }

    public static void main(String[] args) {
        int array[]={1,2,3,4};
        printReverse(array);

    }
}