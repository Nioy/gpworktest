package gpwork.factorypatternwork.factorypattern;

public class UnionPayBefore implements IPayBefore {
    public void payBefore() {
        System.out.println("银联支付之前");
    }
}
