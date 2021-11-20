package EXCEPTION;

class Account1 {
    int balanceamount;

    public Account1() {
        balanceamount=10000;
    }

    public synchronized void withdraw(int amt)
    {
        try
        {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        balanceamount=balanceamount-amt;
        System.out.println(balanceamount);
    }
}
class Mythread extends Thread
{
    Account1 obj=null;
    public Mythread(Account1 t1)
    {
        obj=t1;
    }
    public void run()
    {
        obj.withdraw(500);
    }
}
public class SynchronizedDemo122 {

    public static void main(String ...args)
    {
        Account1 a1=new Account1();
        Mythread obj1=new Mythread(a1);
        Mythread obj2=new Mythread(a1);
        obj1.start();
        obj2.start();
    }
}
