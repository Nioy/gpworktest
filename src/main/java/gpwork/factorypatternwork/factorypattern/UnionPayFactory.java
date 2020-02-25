package gpwork.factorypatternwork.factorypattern;

public class UnionPayFactory implements IPayFactory {


    public IPayBefore payBefore() {
        return new UnionPayBefore();
    }

    public IPay pay() {
        return new UnionPay();
    }

    public IPayAfter payAfter() {
        return new UnionPayAfter();
    }
}
