public class Reverse_Integer {
    public static int Method(int x) {
     
       String name=Integer.toString(x);
       String copy=new String("");
       for(int i=name.length()-1;i>=0;i--){
        copy+=name.charAt(i);       
       }
    
    return Integer.valueOf(copy);

    }

    public static void main(String[] args) {

        int var=1144;
        System.out.println(Method(var));
        String name=Integer.toString(var);
        System.out.println(name);
        System.out.println(name.length());

    }
}
