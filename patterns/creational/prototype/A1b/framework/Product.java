package patterns.creational.prototype.A1b.framework;

public interface Product extends Cloneable {

    public abstract void use(String s);

    public abstract Product createCopy();
}
