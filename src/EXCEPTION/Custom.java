package EXCEPTION;

import java.util.Scanner;

class Custom {
    int a, b, c;
    Custom() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number 1: ");
        this.a = sc.nextInt();
        System.out.println("Enter the number 2: ");
        this.b = sc.nextInt();
        System.out.println("Enter the number 3: ");
        this.c = sc.nextInt();
    }

    public void average_method() {
        int result = (a + b + c) / 3;
        System.out.println("The average of three number is: " + result);
    }
}

class  Del extends Exception {
    Del(String s)
    {
        super(s);
    }
}

class dude{
    public static void main(String[] args) {
        try {

            Custom obj = new Custom();
            obj.average_method();
            throw new Del("this is my custom exception ");
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        System.out.println("end of the program");
    }
}