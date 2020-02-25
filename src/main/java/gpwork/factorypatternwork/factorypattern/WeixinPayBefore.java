package gpwork.factorypatternwork.factorypattern;

public class WeixinPayBefore implements IPayBefore {
    public void payBefore() {
        System.out.println("微信支付之前");
    }
}
