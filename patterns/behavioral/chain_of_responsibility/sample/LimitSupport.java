package patterns.behavioral.chain_of_responsibility.sample;

public class LimitSupport extends Support {
    private int limit; // 이 번호 미만이면 해결 가능

    public LimitSupport(String name, int limit) {
        super(name);
        this.limit = limit;
    }

    @Override
    protected boolean resolve(Trouble trouble) {
        return trouble.getNumber() < limit;
    }
}
