package patterns.behavioral.state.A4;

public class DayState implements State {
    private static DayState singleton = new DayState();

    private DayState(){
    }

    public static DayState getInstance() {
        return singleton;
    }

    @Override
    public void doClock(Context context, int hour) {
        if (hour < 9 || 17 <= hour) { // 야간이면, NightState 로 교체
            context.changeState(NightState.getInstance());
        }
    }

    @Override
    public void doUse(Context context) {
        context.recordLog("금고 사용(주간)");
    }

    @Override
    public void doAlarm(Context context) {
        context.callSecurityCenter("비상벨(주간)");
        context.changeState(UrgentState.getInstance());
    }

    @Override
    public void doPhone(Context context) {
        context.callSecurityCenter("일반 통화(주간)");
    }

    @Override
    public String toString() {
        return "[주간]";
    }
}
