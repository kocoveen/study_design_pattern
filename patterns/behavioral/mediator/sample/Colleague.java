package patterns.behavioral.mediator.sample;

public interface Colleague {
    // Mediator 설정
    public abstract void setMediator(Mediator mediator);

    // Mediator 에서 활성/비활성 지시
    public abstract void setColleagueEnabled(boolean enabled);
}
