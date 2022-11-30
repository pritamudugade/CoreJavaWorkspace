import java.util.Scanner;

public class BankOperation {
    public void withdraw(){
        int a = 10000;
        System.out.println("-------------Withdraw the Amount-------------------");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount to withdraw : ");
        int b = sc.nextInt();
        int c = a - b;
        System.out.println("Remaining Balance is " +c);
    }

    public void deposit(){
        int a = 10000;
        System.out.println("-------------Deposite the Amount-------------------");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount to deposit : ");
        int b = sc.nextInt();
        int c = a + b;
        System.out.println("Amount After Deposite is " +c);
    }

    public void mini(){
        System.out.println("-------------Mini Statement-------------------");
        System.out.print(" Welcome to mini statement option ");
    }

}
