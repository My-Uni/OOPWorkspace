import java.util.Random;

public class dice {
    private int value;
    private Random rnd;

    public dice() {
        rnd = new Random();
        value = rnd.nextInt(6) + 1;
    }

    public int getValue() {
        return value;
    }

    public void roll() {
        value = rnd.nextInt(6) + 1;
    }

    public void rollDice01(int times) {
        System.out.println("=====================================");
        System.out.println("Roll dice " + times + " and display results");
        for (int i = 0; i < times; i++) {
            // Start new line after 5
            if ((i % 5) == 0) {
                System.out.println();
            }
            dice d = new dice();
            d.roll();
            System.out.print(d.getValue() + "\t");
        }
        System.out.println("\nEnd of test");
        System.out.println("=====================================");
    }

    public void rollDice02(int times) {
        int highest = -1000;
        int lowest = 1000;

        System.out.println("=====================================");
        System.out.println("Roll dice " + times + " and display results");
        for (int i = 0; i < times; i++) {
            dice d = new dice();
            d.roll();
            int value = d.getValue();
            if (value > highest) {
                highest = value;
            }
            if (value < lowest) {
                lowest = value;
            }
        }
        System.out.println("\nHighest value: " + highest);
        System.out.println("Lowest value: " + lowest);
        System.out.println("\nEnd of test");
        System.out.println("=====================================");
    }
}
