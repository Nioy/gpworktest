package gpwork.factorypatternwork.factorypattern;


public class WeixinPayFactory implements IPayFactory {

    public IPayBefore payBefore() {
        return new WeixinPayBefore();
    }

    public IPay pay() {
        return new WeixinPay();
    }

    public IPayAfter payAfter() {
        return new WeixinPayAfter();
    }
}
