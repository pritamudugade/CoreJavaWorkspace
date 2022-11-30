package pack1;
public class Main1 {
    public static void main(String[] args) {
        A1 ob = new A1();
        System.out.println(ob.a);
        System.out.println(ob.b);
        System.out.println(ob.c);
        // System.out.println(ob.d);   -- d variable declared as private so, it cannot be accessed in same package.
    }
}
