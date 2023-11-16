package patterns.structural.proxy.sample;

public class Main {
    public static void main(String[] args) {
        Printable p = new PrintProxy("Alice");
        System.out.println("이름은 현재 " + p.getPrinterName() + "입니다.");
        p.setPrinterName("Bob");
        System.out.println("이름은 현재 " + p.getPrinterName() + "입니다.");
        p.print("Hello, world.");
    }
}
