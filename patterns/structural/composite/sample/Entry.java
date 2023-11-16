package patterns.structural.composite.sample;

public abstract class Entry {
    // 이름 얻기
    public abstract String getName();

    // 크기 얻기
    public abstract int getSize();

    // 목록 표시
    public void printList() {
        printList("");
    }

    // prefix 붙여 목록 표시
    protected abstract void printList(String prefix);

    // 문자열 표시
    @Override
    public String toString() {
        return getName() + " (" + getSize() + ")";
    }
}
