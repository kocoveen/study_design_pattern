package patterns.creational.prototype.sample.framework;

public interface Product extends Cloneable {
    public abstract void use(String s);
    public abstract Product createCopy();
}
