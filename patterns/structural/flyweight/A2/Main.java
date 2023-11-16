package patterns.structural.flyweight.A2;


public class Main {
    private static BigString[] bsArray = new BigString[10000];

    public static void main(String[] args) {
        System.out.println("공유한 경우:");
        testAllocation(true);
        System.out.println("공유하지 않는 경우:");
        testAllocation(false);
    }

    private static void testAllocation(boolean shared) {
        for (int i = 0; i < bsArray.length; i++) {
            bsArray[i] = new BigString("1212123", shared);
        }
        showMemory();
    }

    private static void showMemory() {
        Runtime.getRuntime().gc();
        long used = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        System.out.println("사용 메모리 = " + used);
    }
}
