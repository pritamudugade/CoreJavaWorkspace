import java.util.Scanner;
public class BankOperationMain {
    public static void main(String[] args) {
        BankOperation obj = new BankOperation();

        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to ABC Bank. Please Enter your PIN Number :");
        int pin = sc.nextInt();
        if (pin==1234) {
            System.out.print("ABC Bank  Press 1. Withdraw  2. Deposit  3. Mini Statement  4. Exit  : ");
            int select = sc.nextInt();
            switch (select) {
                case 1:
                    obj.withdraw();
                    break;
                case 2:
                    obj.deposit();
                    break;
                case 3:
                    obj.mini();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Entered Invalid Number");
            }
        } else {
            System.out.println("Wrong PIN");
        }
    }
}

