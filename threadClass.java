
class MyThread implements Runnable{

//Thread runnable interface
    public void run(){
        for(int index=0;index<=5;index++){
            System.out.println(index);
        }
    }
}
class anotherThread extends Thread{
    public void run(){
        for(int index=0;index<=5;index++){
            System.out.println(index);
        }
    }
}
//thread synchronization
class A{
// synchronized void m1(){
// System.out.println("Synchronized");
//     }
     void m1(){
        System.out.println("synchronized🤣");
    }

}
class threadSyn extends Thread{
    
    A a;
    threadSyn(A aa){
        a=aa;
    }
    // public void run(){
    //     try{
    //     a.m1();
    // }catch(ArithmeticException e){

    // }
    // }
    //synchronized block
    public void run(){
        try{
        synchronized(a){
            a.m1();
        }            
        }catch(StringIndexOutOfBoundsException e){

        }
    }
}

//Thread
class B extends Thread{
    public void runnable(){
        for(int index=0;index<5;index++){
            System.out.println("index ==>"+index);
        }
    } 
}




public class threadClass {
    public static void main(String[] args){

        // MyThread t=new MyThread();
        // Thread T=new Thread(t);
        // T.start();

        // anotherThread a=new anotherThread();
        // Thread t1=new Thread(a);
        // t1.start(); 

        // A a=new A();
        // threadSyn obj=new threadSyn(a);
        // obj.start();

        B b=new B();
        b.start();


    }
}