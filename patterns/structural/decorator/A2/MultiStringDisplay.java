package patterns.structural.decorator.A2;

import java.util.ArrayList;
import java.util.List;

public class MultiStringDisplay extends Display {
    // 표시 문자열 저장소
    private List<String> body = new ArrayList<>();

    // 표시 문자열 최대 문자 수
    private int columns = 0;

    // 문자열 추가
    public void add(String msg) {
        body.add(msg);
        if (columns < msg.length()) {
            // 최대 문자 수 갱신
            columns = msg.length();
        }
        updatePadding();
    }

    @Override
    public int getColumns() {
        return columns;
    }

    @Override
    public int getRows() {
        return body.size();
    }

    @Override
    public String getRowText(int row) {
        return body.get(row);
    }

    // 표시 문자열 오른쪽 끝에 채울 공백을 필요에 따라 늘림
    private void updatePadding() {
        for (int row = 0; row < body.size(); row++) {
            String line = body.get(row);
            int padding = columns - line.length();
            if (padding > 0) {
                body.set(row, line + spaces(padding)); // space(padding) = " ".repeat(padding)
            }
        }
    }

    // count 수 만큼의 공백 생성
    private String spaces(int count) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append(' ');
        }
        return sb.toString();
    }
}
