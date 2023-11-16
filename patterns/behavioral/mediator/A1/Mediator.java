package patterns.behavioral.mediator.A1;

public interface Mediator {
    // Colleague 생성
    public abstract void createColleagues();

    // Colleague 상태 변화 시 호출
    public abstract void colleagueChanged();
}
