package patterns.behavioral.strategy.A1;

public class Main {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java Main randomSeed1 randomSeed2");
            System.out.println("Example: java Main 314 15");
            System.exit(0);
        }
        int seed1 = Integer.parseInt(args[0]);
        int seed2 = Integer.parseInt(args[1]);

        Player p1 = new Player("KIM", new WinningStrategy(seed1));
        Player p2 = new Player("PARK", new RandomStrategy(seed2));

        for (int i = 0; i < 10000; i++) {
            Hand nextHand1 = p1.nextHand();
            Hand nextHand2 = p2.nextHand();
            if (nextHand1.isStrongerThan(nextHand2)) {
                System.out.println("Winner:" + p1);
                p1.win();
                p2.lose();
            } else if (nextHand2.isStrongerThan(nextHand1)) {
                System.out.println("Winner:" + p2);
                p1.lose();
                p2.win();
            } else {
                System.out.println("Draw...");
                p1.draw();
                p2.draw();
            }
        }

        System.out.println("Total Result: ");
        System.out.println(p1);
        System.out.println(p2);
    }
}
