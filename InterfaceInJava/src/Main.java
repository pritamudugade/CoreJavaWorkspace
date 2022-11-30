public class Main {
    public static void main(String[] args) {
        AvonCycles obj = new AvonCycles();
        obj.applyBrakes(1);
        obj.speedUP(1);
       // obj.a = 455;       Cannot assign/modify a value of final variable.
        System.out.println("Value of a = " +obj.a);

        obj.blowHornPee();
        obj.blowHornPoo();
    }
}