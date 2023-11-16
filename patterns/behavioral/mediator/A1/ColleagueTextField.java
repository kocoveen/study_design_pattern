package patterns.behavioral.mediator.A1;

import java.awt.*;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

public class ColleagueTextField extends TextField implements TextListener, Colleague {
    private Mediator mediator;

    public ColleagueTextField(String text, int columns) {
        super(text, columns);
    }

    // Mediator 설정
    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    // Mediator 에서 활성/비활성 지시
    @Override
    public void setColleagueEnabled(boolean enabled) {
        setEnabled(enabled);
        // 활성/비활성에 맞게 배경색 변경
        setBackground(enabled ? Color.white : Color.lightGray);
    }

    @Override
    public void textValueChanged(TextEvent e) {
        // 문자열이 바뀌면 Mediator 에게 알림
        mediator.colleagueChanged();
    }
}
