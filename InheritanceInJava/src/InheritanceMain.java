public class InheritanceMain {
    public static void main(String[] args) {
        AvonCycle ac = new AvonCycle();
        ac.speedUp();
        ac.speedDown();
        ac.hornPo();
        ac.brandName();
        HeroCycle hc = new HeroCycle();
        hc.applyBrakes();
        hc.hornPeep();
        hc.brandName();
    }
}
