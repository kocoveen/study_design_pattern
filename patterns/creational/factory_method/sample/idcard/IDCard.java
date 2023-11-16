package patterns.creational.factory_method.sample.idcard;

import patterns.creational.factory_method.sample.framework.Product;

public class IDCard extends Product {
    private String owner;

    IDCard(String owner) {
        System.out.println(owner + "의 카드를 만들었습니다.");
        this.owner = owner;
    }

    @Override
    public void use() {
        System.out.println(this + "을(를) 사용합니다.");
    }

    @Override
    public String toString() {
        return "[IDCard:" + owner + "]";
    }

    public String getOwner() {
        return owner;
    }
}
