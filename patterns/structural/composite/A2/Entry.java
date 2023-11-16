package patterns.structural.composite.A2;

public abstract class Entry {
    private Entry parent;

    // 부모 설정
    protected void setParent(Entry parent) {
        this.parent = parent;
    }

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

    // 전체 경로 조회
    public String getFullName() {
        StringBuilder fullName = new StringBuilder();
        Entry entry = this;
        do {
            fullName.insert(0, entry.getName());
            fullName.insert(0, "/");
            entry = entry.parent;
        } while (entry != null);
        return fullName.toString();
    }
}
