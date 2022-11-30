public class AvonCycles implements BicycleInterface, HornBicycleInterface{  //we can implement multiple interfaces at once but cannot extends class hence interface concept comes in picture
    public void applyBrakes(int decrement){

        System.out.println("Applying Brakes");
    }
    public void speedUP(int increment){
        System.out.println("Applying Speed Up");
    }

    public void blowHornPee(){
        System.out.println("Pee Pee Pee Pee");
    }
    public void blowHornPoo() {
        System.out.println("Poo Poo Poo Poo");
    }
}
