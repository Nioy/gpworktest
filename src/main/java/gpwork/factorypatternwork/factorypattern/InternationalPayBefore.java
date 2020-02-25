package gpwork.factorypatternwork.factorypattern;

public class InternationalPayBefore implements IPayBefore {
    public void payBefore() {
        System.out.println("跨境支付之前");
    }
}
