import lotr.Character;

public class GameManager {

    void fight(Character c1, Character c2) {
        int round = 1;

        if (c1.getClass().getSimpleName().equals("Hobbit") && c2.getClass().getSimpleName().equals("Hobbit")) {
            System.out.println("2 Hobbits, draw then!");
            return;
        }

        System.out.printf("Character 1 - %s, Character 2 - %s\n",
                c1,
                c2
        );

        while (c1.isAlive() && c2.isAlive()) {
            System.out.printf("Round %d\n", round);
            c1.kick(c2);
            System.out.println("Character 1 hits Character 2");

            if (c2.isAlive()) {
                c2.kick(c1);
                System.out.println("Character 2 hits Character 1");
            }

            System.out.printf("Character 1 has %d hp\n", c1.getHp());
            System.out.printf("Character 2 has %d hp\n", c2.getHp());

            if (!c1.isAlive() || !c2.isAlive()) {
                System.out.println(c1.isAlive() ? "\nCharacter 1 wins!" : "\nCharacter 2 wins!");
                break;
            }
            round++;
        }
    }
}
