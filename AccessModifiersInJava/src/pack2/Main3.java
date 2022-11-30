package pack2;

public class Main3 {
    public static void main(String[] args) {
        A2 objA2 = new A2();
        System.out.println(objA2.a);  // Only public can be accessed.
       // System.out.println(objA2.b);  -- Outside packages cannot be accessed
       // System.out.println(objA2.c);
       // System.out.println(objA2.d);
    }
}

