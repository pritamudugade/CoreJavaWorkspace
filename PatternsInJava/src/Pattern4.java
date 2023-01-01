public class Pattern4 {
    public static void main(String[] args) {
        int i, j, rows = 4, space = 0;
        for(i = 1; i <= rows; i++){
            for(j = space-1; j >= 0; j--){
                System.out.print(" ");
            }
            for(j = 1; j <= i; j++){
                System.out.print( j);
            }
            System.out.println("Hello pritam");
        }
    }
}
