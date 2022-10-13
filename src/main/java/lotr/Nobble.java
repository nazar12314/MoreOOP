package lotr;

import java.util.Random;

public abstract class Nobble extends Character {
    private final static Random random = new Random();
    private final int upperBound;
    private final int lowerBound;

    public Nobble(int lowerBound, int upperBound) {
        super(
                random.nextInt(upperBound - lowerBound + 1) + lowerBound,
                random.nextInt(upperBound - lowerBound + 1) + lowerBound
        );
        this.upperBound = upperBound;
        this.lowerBound = lowerBound;
    }

    public void kick(Character c) {
        c.setHp(c.getHp() - new Random().nextInt(getPower() + 1));
    }
}
