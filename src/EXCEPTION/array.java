package EXCEPTION;

import java.util.Scanner;

public class array {
    public static void main(String ...args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int s=sc.nextInt();
        int ar[]=new int[s];
        for(int x=0;x<s;x++)
            ar[x]=sc.nextInt();

        try
        {
            System.out.println("Search thew index");
            int search=sc.nextInt();
            System.out.println(ar[search]);
        }catch(Exception e)
        {
            System.out.println("ArrayIndexOutOfBound");
        }

    }
}
