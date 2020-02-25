package gpwork.factorypatternwork.factorypattern;

public class UnionPayAfter implements IPayAfter {

    public void payAfter() {
        System.out.println("银联支付之后");
    }
}
