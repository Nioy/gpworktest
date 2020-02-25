package gpwork.factorypatternwork.factorypattern;

public interface IPayFactory {
    IPayBefore payBefore();
    IPay pay();
    IPayAfter payAfter();
}
