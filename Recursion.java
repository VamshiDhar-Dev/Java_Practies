
class Recursion {
    // Sum of array
    public static int ArraySum(int arr[], int index) {
        if (index == 0) {
            return 0;
        } else {

            return arr[index - 1] + ArraySum(arr, index - 1);
        }
    }

    // print given n natural numbers
    public static void PrinNumb(int num) {
        if (num == 0) {
            return;
        } else {
            System.out.println(num);
            PrinNumb(num - 1);
        }
    }

    // print sum of given n natural numbers
    public static int sum(int num) {
        if (num == 0) {
            return 0;
        } else {
            return num + sum(num - 1);
        }

    }

    // power of given number
    public static int Power(int a, int b) {
        if (b == 0) {
            return 1;
        } else {
            return a * Power(a, b - 1);
        }

    }

    // given string consist of consonent are not
    public static String VowelConsonent(String str, int index) {
        if (index == str.length() - 1) {
            return "";
        }
        String name1 = VowelConsonent(str, index + 1);
        if (str.charAt(index) == 'a' || str.charAt(index) == 'i' || str.charAt(index) == 'o' || str.charAt(index) == 'e'
                || str.charAt(index) == 'u') {
            name1 += String.valueOf(str.charAt(index));
        }
        return name1;
    }

    // recursion for palindrone
    public static boolean Palandron(String str1, int index) {
        if (index == str1.length() - 1) {
            return true;
        }
        boolean call = Palandron(str1, index + 1);
        if (str1.charAt(index) != str1.charAt(str1.length() - index - 1)) {
            call = false;
        }
        return call;

    }

    // recursion fibanacci series
    public static void Fib(int num, int a, int b) {
        if (num == 0) {
            // System.out.println(0);
            return;
        }
        if (num == 1) {
            // System.out.println(0);
            // System.out.println(1);
        }
        int c = a + b;
        System.out.println(c);
        a = b;
        b = c;
        Fib(num - 1, a, b);

    }

    // one more way of fib
    public static void Fib1(int num) {
        if (num == 0) {
            // System.out.println(0);
            return;
        }
        int a = 0, b = 1;
        int c = a + b;
        System.out.println(c);
        a = b;
        b = c;  
        Fib(num - 1, a, b);

    }

    // permutation and combination
    public static int Permutation(int n, int r) {
        if (n == 0) {
            return 1;
        }if(r==0){
            return 1;
        }
        
        int n1=n*Permutation(n-1, r-1);
        int r1=r*Permutation(n1-1, r-1);
        int result=n1/r1;
        return result;
    }
    //integer to string name conversion
    public static void IntergertoString(int n){
        //reverse the number 
        int reverse=0;//reference 
        //use while loop for reverse
        while(n!=0){
            int lastDigit=n%10;//take last part of number 1947%10 ==>7
            reverse=reverse*10+lastDigit; //combined with new number
            n/=10;//remove last part  1947/10 ===>194
        }
        String a[]={"zero","one","two","three","four","five","six","seven","eight","nine"};
        if(reverse==0){
            return;
        }
        System.out.print(a[reverse%10]+" ");
        IntergertoString(reverse/10);
        
    }

    public static void main(String[] args) {
        // int array[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        // int index = array.length - 1;
        // System.out.println(ArraySum(array, index));
        // int mid = (array.length) / 2;
        // int target = 2;
        // System.out.println(sum(5));
        // System.out.println(Power(target, target));
        // String name = "ab1451ba";
        // int index1 = 0;
        // System.out.println(VowelConsonent(name, index1));
        // System.out.println(Palandron(name, index1));
        // Fib1(10);
        // int n=5,r=1;
        // System.out.println(Permutation(n, r));
        int n1=1239;
        IntergertoString(n1);
        // System.out.println(n1/10);
        // System.out.println(n1%10);
    }
}