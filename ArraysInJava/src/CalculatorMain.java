import java.util.Scanner;

public class CalculatorMain {
    public static void main(String[] args) {
        Calculator obj = new Calculator();

        Scanner sc = new Scanner(System.in);
        System.out.print("Calculator in JAVA  Press 1. Addition  2. Subtraction  3. Division  4. Multiplication  5. Exit  : ");
        int select = sc.nextInt();
        switch (select) {
            case 1:
                obj.sum();
                break;
            case 2:
                obj.minus();
                break;
            case 3:
                obj.Division();
                break;
            case 4:
                obj.Multiplication();
                break;
            case 5:
                break;
            default:
                System.out.println("Entered Invalid Number");
        }
    }
}
