package patterns.behavioral.visitor.sample;

public interface Element {
    public abstract void accept(Visitor visitor);
}
