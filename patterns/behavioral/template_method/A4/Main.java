package patterns.behavioral.template_method.A4;

public class Main {
    public static void main(String[] args) {
        // 'H'를 가진 CharDisplay 인스턴스 생성
        AbstractDisplay d1 = new CharDisplay('H');

        // "Hello, world."를 가진 StringDisplay 인스턴스 생성
        AbstractDisplay d2 = new StringDisplay("Hello, world.");

        // d1, d2 모두 같은 AbstractDisplay 하위 클래스의 인스턴스이므로, display() 호출 가능
        // 동작 흐름은 AbstractDisplay 에서, 실제 동작은 CharDisplay 및 StringDisplay 에서 정해짐
        d1.display();
        d2.display();

    }

}
