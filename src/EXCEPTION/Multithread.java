package EXCEPTION;

public class Multithread {

    String[] ar ={"white","blue","black","green","red","yellow"};

    public void Display()
    {
        while(true)
        {
            int l=(int)(Math.random()*5);
            if(l==4)
                break;
            System.out.println(ar[l]);

        }
    }


}

class thread2 implements Runnable
{
    Multithread obj=null;
    public thread2(Multithread n1)
    {
        obj=n1;
    }

    public void run()
    {
        obj.Display();
        printName();
    }
    public void printName()
    {
        Thread z=Thread.currentThread();
        String name=z.getName();
        System.out.println("Name of the thread : "+name);
    }

}

class Test101
{
    public static void main(String[] args) {
        Multithread m1=new Multithread();
        Thread scooby=new Thread(new thread2(m1));
        Thread shaggy=new Thread(new thread2(m1));
        scooby.setName("Scooby");
        shaggy.setName("Shaggy");

        scooby.start();
        shaggy.start();
        }
}
