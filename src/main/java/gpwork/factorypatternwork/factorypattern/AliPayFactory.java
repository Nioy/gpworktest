package gpwork.factorypatternwork.factorypattern;

public class AliPayFactory implements IPayFactory {


    public IPayBefore payBefore() {
        return new AliPayBefore();
    }

    public IPay pay() {
        return new AliPay();
    }

    public IPayAfter payAfter() {
        return new AliPayAfter();
    }
}
