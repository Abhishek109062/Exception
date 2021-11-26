package EXCEPTION;
//Runnable Interface use
//class MyThread90 implements Runnable
//{
//    public void run()
//    {
//        for(int x=0;x<10;x++)
//            System.out.println("mythread90");
//    }
//}
public class Test90 {
    public static void main(String[] args)
    {
//        MyThread90 obj1=new MyThread90();
//        Thread obj=new Thread(new MyThread90());
        Thread obj =new Thread(() -> System.out.println("Main thread"));
        obj.start();
        for(int x=0;x<10;x++)
            System.out.println("main thread");
    }
}