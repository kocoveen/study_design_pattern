package patterns.creational.factory_method.A2.idcard;

import patterns.creational.factory_method.A2.framework.Factory;
import patterns.creational.factory_method.A2.framework.Product;

public class IDCardFactory extends Factory {
    private int serial = 100;
    @Override
    protected Product createProduct(String owner) {
        return new IDCard(owner, serial++);
    }

    @Override
    protected void registerProduct(Product product) {
        System.out.println(product + "을(를) 등록했습니다.");
    }
}
