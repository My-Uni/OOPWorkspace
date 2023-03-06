public class TestDice {
    public static void main(String[] args) {

        dice d = new dice();

        System.out.println(d.getValue());
        d.roll();
        System.out.println(d.getValue());

        d.rollDice02(2500);
        d.rollDice02(10);
        d.rollDice02(10);
        d.rollDice02(10);
        d.rollDice02(10);

    }
}
