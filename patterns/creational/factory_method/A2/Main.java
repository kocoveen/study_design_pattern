package patterns.creational.factory_method.A2;

import patterns.creational.factory_method.A2.framework.Factory;
import patterns.creational.factory_method.A2.framework.Product;
import patterns.creational.factory_method.A2.idcard.IDCardFactory;

public class Main {
    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product card1 = factory.create("박용택");
        Product card2 = factory.create("이병규");
        Product card3 = factory.create("봉중근");
        card1.use();
        card2.use();
        card3.use();
    }
}
