public class Palindrome_Int {
    public static boolean isPalindrome(int x) {
        String name=Integer.toString(x);
        int count=0;
        for(int index=0;index<name.length();index++){
            if(name.charAt(index)!=name.charAt(name.length()-index-1)){
                count++;
            }
        }
        return (count==0)?true:false;
    // return  count;

        
    }
    public static void main(String[] args) {
         System.out.println(isPalindrome(121));
         System.out.println();
    }
}
