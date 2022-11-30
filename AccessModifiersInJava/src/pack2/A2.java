package pack2;

import pack1.*;

public class A2 extends A1 {
    public void A2obj(){
        System.out.println(a);
        System.out.println(b);
        //System.out.println(c);  -- Cannot be accessed outside the package's [subclass]
       // System.out.println(d);  -- Cannot be accessed outside the package's [subclass]
    }
}

