package patterns.behavioral.template_method.sample;

public class CharDisplay extends AbstractDisplay {
    private char ch; // 표시할 문자

    public CharDisplay(char ch) {
        this.ch = ch;
    }

    @Override
    public void open() {
        // 시작 문자열 "<<" 출력
        System.out.print("<<");
    }

    @Override
    public void print() {
        // 필드에 저장해 둔 문자 1회 표시
        System.out.print(ch);
    }

    @Override
    public void close() {
        // 종료 문자열 ">>" 출력
        System.out.println(">>");
    }
}
