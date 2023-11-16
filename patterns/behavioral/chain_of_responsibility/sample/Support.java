package patterns.behavioral.chain_of_responsibility.sample;

public abstract class Support {
    private String name; // 이 트러블 해결자 이름
    private Support next; // 떠넘길 곳

    public Support(String name) {
        this.name = name;
        this.next = null;
    }

    // 떠넘길 곳을 설정
    public Support setNext(Support next) {
        this.next = next;
        return next;
    }

    // 트러블 해결 절차를 결정
    public void support(Trouble trouble) {
        if (resolve(trouble)) {
            done(trouble);
        } else if (next != null) {
            next.support(trouble);
        } else {
            fail(trouble);
        }
    }

    // 트러블 해결자의 문자열 표현
    @Override
    public String toString() {
        return '[' + name + ']';
    }

    // 해결하려고 함
    protected abstract boolean resolve(Trouble trouble);

    // 해결
    protected void done(Trouble trouble) {
        System.out.println(trouble + " is resolved by " + this + '.');
    }

    // 미해결
    protected void fail(Trouble trouble) {
        System.out.println(trouble + " cannot be resolved.");
    }
}
