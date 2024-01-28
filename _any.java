
class SumException extends Exception{
    SumException(){}
    public SumException(String message){
        super(message);
    }
}
class A{
    void m1(){
        System.out.println("Hello");
    }
    {  
        System.out.println(" Instance Block");  
        } 
        static{
            System.out.println("static");
        }
}
public class _any{
    //fibnanci series without recursion
    public static void name(int number) {
        int index=0,a=0,b=1;;
        System.out.println(a);
        System.out.println(b);
        while(index<number){
            
            int c=a+b;
            System.out.println(c);
            a=b;
            b=c;
            index++;
        }
    }
    public static void main(String[] args) {
        // try (Scanner in = new Scanner(System.in)) {
        //     int a=in.nextInt();
        //     int b=in.nextInt();
        //     try{
        //         if((a+b)<10){
        //             throw new SumException("This not good");
        //         }else{
        //             System.out.println("sum"+(a+b));
        //         }
        //     }catch(SumException obj){
        //         System.out.println("Here is excepiton");

        //     }
        // }

        A a=new A();
        a.m1();
        name(10);

    }
}