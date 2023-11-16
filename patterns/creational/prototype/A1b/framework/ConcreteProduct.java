package patterns.creational.prototype.A1b.framework;

public abstract class ConcreteProduct implements Product {

    public Product createCopy() {
        Product p = null;
        try {
            p = (Product) clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return p;
    }

}
