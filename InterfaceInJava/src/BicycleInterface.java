public interface BicycleInterface {
     int a = 45;  //you can create the properties of interface but cannot change its value as it is final by default.
     public void applyBrakes(int decrement);   //By default it's a public
     public void speedUP(int increment);      //By default it's a public
}

