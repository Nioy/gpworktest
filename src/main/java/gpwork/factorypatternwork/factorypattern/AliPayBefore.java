package gpwork.factorypatternwork.factorypattern;

public class AliPayBefore implements IPayBefore {
    public void payBefore() {
        System.out.println("支付宝支付之前");
    }
}
