package patterns.structural.proxy.A1;

public interface Printable {
    public abstract void setPrinterName(String name); // 이름 설정
    public abstract String getPrinterName(); // 이름 취득
    public void print(String string); // 문자열 표시 (print.out)
}
