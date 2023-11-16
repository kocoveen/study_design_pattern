package patterns.creational.factory_method.sample.idcard;

import patterns.creational.factory_method.sample.framework.Factory;
import patterns.creational.factory_method.sample.framework.Product;

public class IDCardFactory extends Factory {
    @Override
    protected Product createProduct(String owner) {
        return new IDCard(owner);
    }

    @Override
    protected void registerProduct(Product product) {
        System.out.println(product + "을(를) 등록했습니다.");
    }
}
