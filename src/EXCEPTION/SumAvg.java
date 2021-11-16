package EXCEPTION;

import java.util.Scanner;

public class SumAvg {
    public static void main(String ...args)
    {
        try {
            int[] ar = new int[5];
            int sum=0;
            Scanner sc = new Scanner(System.in);
            for (int x = 0; x < 5; x++)
            {
                ar[x] = sc.nextInt();
                sum+=ar[x];
            }
            System.out.println("Sum = "+sum+" Average = "+(sum/5.0));
        }catch(Exception e)
        {
            System.out.println("Exception handled");
        }
    }
}
