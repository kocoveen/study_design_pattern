package patterns.creational.factory_method.sample;

import patterns.creational.factory_method.sample.framework.Factory;
import patterns.creational.factory_method.sample.framework.Product;
import patterns.creational.factory_method.sample.idcard.IDCardFactory;

public class Main {
    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product card1 = factory.create("홍길동");
        Product card2 = factory.create("김철수");
        Product card3 = factory.create("박영희");
        card1.use();
        card2.use();
        card3.use();
    }
}
