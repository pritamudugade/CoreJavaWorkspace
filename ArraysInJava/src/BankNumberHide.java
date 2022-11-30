import java.util.Scanner;

public class BankNumberHide {
    public static void main(String[] args) {

        //Pre Defined
        int[] num = {1,2,3,4,5,6,7,8,9,1};
        for(int i = 0; i <= num.length-1; i++){
            if(i < 6) {
                System.out.print("*");
            }
            else {
              System.out.print(num[i]);
           }
        }

        //User Defined
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your 10 Digit Account Number : ");
        int a = sc.nextInt();
        for(int j = 0; j <= 2; j++){
            System.out.println(a);
        }

    }
}
