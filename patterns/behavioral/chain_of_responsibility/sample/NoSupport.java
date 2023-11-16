package patterns.behavioral.chain_of_responsibility.sample;

public class NoSupport extends Support {
    public NoSupport(String name) {
        super(name);
    }

    @Override
    protected boolean resolve(Trouble trouble) {
        return false; // 아무것도 해결하지 않음
    }
}
