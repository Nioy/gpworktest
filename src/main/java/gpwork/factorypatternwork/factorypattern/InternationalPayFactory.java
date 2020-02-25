package gpwork.factorypatternwork.factorypattern;


public class InternationalPayFactory implements IPayFactory {

public IPayBefore payBefore() {
        return new InternationalPayBefore();
        }

public IPay pay() {
        return new InternationalPay();
        }

public IPayAfter payAfter() {
        return new InternationalPayAfter();
        }
        }
