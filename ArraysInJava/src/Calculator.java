import java.sql.SQLOutput;
import java.util.Scanner;

public class Calculator {
    public void sum(){
        System.out.println("-------------Addition-------------------");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Value of 1st Number : ");
        int a = sc.nextInt();
        System.out.print("Enter the Value of 2nd Number : ");
        int b = sc.nextInt();
        int c = a + b;
        System.out.println("Addition of Given Number is " +c);
    }

    public void minus(){
        System.out.println("-------------Subtraction-------------------");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Value of 1st Number : ");
        int a = sc.nextInt();
        System.out.print("Enter the Value of 2nd Number : ");
        int b = sc.nextInt();
        int c = a - b;
        System.out.println("Subtraction of Given Number is " +c);
    }

    public void Division(){
        System.out.println("-------------Division-------------------");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Value of 1st Number : ");
        int a = sc.nextInt();
        System.out.print("Enter the Value of 2nd Number : ");
        int b = sc.nextInt();
        int c = a / b;
        System.out.println("Division of Given Number is " +c);
    }

    public void Multiplication(){
        System.out.println("-------------Multiplication-------------------");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Value of 1st Number : ");
        int a = sc.nextInt();
        System.out.print("Enter the Value of 2nd Number : ");
        int b = sc.nextInt();
        int c = a * b;
        System.out.println("Multiplication of Given Number is " +c);
    }
}
