package EXCEPTION;

import java.util.Scanner;
class Average {
    Scanner sc = new Scanner(System.in);
    int a, b, c;

    public Average()throws MyException {
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

class  MyException extends Exception {
    public MyException() {
        super("");
    }
}

class method{
    public static void main(String[] args) {
        try {
            Average obj = new Average();
            obj.average_method();
            }
        catch(MyException e)
        {
            System.out.println(e.getMessage());
        }
    }
}