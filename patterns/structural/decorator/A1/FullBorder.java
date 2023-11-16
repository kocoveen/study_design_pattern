package patterns.structural.decorator.A1;

public class FullBorder extends Border {
    public FullBorder(Display display) {
        super(display);
    }

    @Override
    public int getColumns() {
        // 문자 수는 내용물 양 쪽에 좌우 장식 문자만큼 더한 것
        return 1 + display.getColumns() + 1;
    }

    @Override
    public int getRows() {
        // 행 수는 내용물의 행수에 상하 장식 문자만큼 더한 것
        return 1 + display.getRows() + 1;
    }

    @Override
    public String getRowText(int row) {
        if (row == 0) {
            return "+" + makeLine('-', display.getColumns()) + "+"; // 상단 테두리
        } else if (row == display.getRows() + 1) {
            return "+" + makeLine('-', display.getColumns()) + "+"; // 하단 테두리
        } else {
            return "|" + display.getRowText(row - 1) + "|"; // 기타
        }
    }

    private String makeLine(char ch, int count) {
        StringBuilder line = new StringBuilder();
        for (int i = 0; i < count; i++) {
            line.append(ch);
        }
        return line.toString();
    }
}
