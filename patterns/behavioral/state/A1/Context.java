package patterns.behavioral.state.A1;

public interface Context {
    public abstract void setClock(int hour); // 시간 설정
    public abstract void changeState(State state); // 상태 전환
    public abstract void callSecurityCenter(String msg); // 경비 센터 경비원 호출
    public abstract void recordLog(String msg); // 경비 센터 기록
}
