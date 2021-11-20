package EXCEPTION;

class Mythread67 extends Thread
        {
            public void run()
            {
                for(int x=0;x<10;x++)
                    System.out.println("Mythread67"+1);
            }
        }

public class DemoException {
    public static void main(String ...args)
    {
        Mythread67 obj =new Mythread67();
//        Thread obj1=Thread.currentThread();
        obj.setPriority(Thread.MAX_PRIORITY);
        obj.start();
        System.out.println(obj.getPriority());
        obj.setName("Abhishek");
        System.out.println(obj.isAlive());
        System.out.println(obj.isDaemon());
        System.out.println(10/0);
        obj.start();
        for(int x=0;x<10;x++)
            System.out.println("Mainthread"+1);
    }
}
