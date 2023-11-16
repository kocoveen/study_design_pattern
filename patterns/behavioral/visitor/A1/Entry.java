package patterns.behavioral.visitor.A1;

public abstract class Entry implements Element {
    public abstract String getName(); // 이름 얻기
    public abstract int getSize(); // 크기 얻기

    // 문자열 표시
    @Override
    public String toString() {
        return getName() + " (" + getSize() + ")";
    }
}
