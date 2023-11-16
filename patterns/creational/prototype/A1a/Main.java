package patterns.creational.prototype.A1a;

import patterns.creational.prototype.A1a.framework.Manager;
import patterns.creational.prototype.A1a.framework.Product;

public class Main {
    public static void main(String[] args) {
        // 준비
        Manager manager = new Manager();
        UnderlinePen upen = new UnderlinePen('-');
        MessageBox wbox  = new MessageBox('*');
        MessageBox sbox = new MessageBox('/');

        //등록
        manager.register("strong message", upen);
        manager.register("waring box", wbox);
        manager.register("slash box", sbox);

        //생성 및 사용
        Product p1 = manager.create("strong message");
        p1.use("Hello, world.");

        Product p2 = manager.create("waring box");
        p2.use("Hello, world.");

        Product p3 = manager.create("slash box");
        p3.use("Hello, world.");
    }
}
