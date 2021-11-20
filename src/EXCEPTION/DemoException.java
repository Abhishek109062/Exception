package EXCEPTION;

class Mythread67 extends Thread
        {
            public void run()
            {
                for(int x=0;x<10;x++)
                    System.out.println("My thread67"+1);
            }
        }

public class DemoException {
    public static void main(String ...args)
    {
        Mythread67 obj =new Mythread67();
        Thread obj1=Thread.currentThread();
        obj1.setPriority(Thread.MAX_PRIORITY);

        System.out.println(obj1.getPriority());
        obj1.setName("Abhishek");
        System.out.println(obj1.isAlive());
        System.out.println(obj1.isDaemon());
        System.out.println(10/0);
        obj.start();
        for(int x=0;x<10;x++)
            System.out.println("Mainthread"+1);
    }
}
