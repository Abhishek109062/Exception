package EXCEPTION;

import java.util.Scanner;

public class NumberFormat {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in))
        {
            for(int x=1;x<=2;x++)
            {
                String s=sc.nextLine();

                int sum=0;
                for(int y=1;y<=3;y++)
                    sum+=sc.nextInt();
                sc.nextLine();
                System.out.println("Average of "+s+" = "+(sum/3.0));
            }
        } catch (Exception e){
            System.out.println("Exception generated");
        }
    }
}
