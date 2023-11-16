package patterns.creational.singleton.sample;

public class Main {
    public static void main(String[] args) {
        System.out.println("Start.");
        // 정적 메서드 호출 시, 정적 메서드 실행 전에 class load -> 객체 초기화 -> singleton 필드의 new Singleton() 실행
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();

        if (obj1 == obj2) {
            System.out.println("obj1과 obj2는 같은 인스턴스입니다.");
        } else {
            System.out.println("obj1과 obj2는 다른 인스턴스입니다.");
        }
        System.out.println("End.");
    }
}
