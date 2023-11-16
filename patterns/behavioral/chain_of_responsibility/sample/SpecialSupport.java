package patterns.behavioral.chain_of_responsibility.sample;

public class SpecialSupport extends Support {
    private int number; // 이 번호만 해결 가능

    public SpecialSupport(String name, int number) {
        super(name);
        this.number = number;
    }

    @Override
    protected boolean resolve(Trouble trouble) {
        return trouble.getNumber() == number;
    }
}
