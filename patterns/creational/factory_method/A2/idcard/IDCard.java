package patterns.creational.factory_method.A2.idcard;

import patterns.creational.factory_method.A2.framework.Product;

public class IDCard extends Product {
    private int serial;
    private String owner;

    IDCard(String owner, int serial) {
        System.out.println(owner + "의 카드를 " + serial + "번으로 만들었습니다.");
        this.serial = serial;
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
