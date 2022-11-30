public class Pattern3 {
    public static void main(String[] args) {
        int i, j, rows = 5;

        for (i=1; i<rows; i++)
        {
            for (j=(rows-i-1); j>0; j--)
            {
                System.out.print(" ");
            }
            for (j=1; j<=i; j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
