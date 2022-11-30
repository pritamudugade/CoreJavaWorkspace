public class Even {
    public void evenAddition(){
        int e[] = {1,2,3,4,5,6,7,8,9,10};
        int sum = 0;
        for(int i = 0; i<=e.length;i++){
            if(i%2==1) {
                sum = sum + e[i];
            }
        }
        System.out.println("Sum of Even Number in [1-10]is : " +sum);
    }
}
