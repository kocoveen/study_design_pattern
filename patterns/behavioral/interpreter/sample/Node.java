package patterns.behavioral.interpreter.sample;

public abstract class Node {
    public abstract void parse(Context context) throws ParseException, patterns.behavioral.interpreter.sample.ParseException;
}
