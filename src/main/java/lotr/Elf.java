package lotr;

public class Elf extends Character {

    public Elf() {
        super(10, 10);
    }

    @Override
    public void kick(Character c) {
        if (getPower() > c.getPower()) {
            c.setHp(0);
        } else {
            c.setHp(c.getHp() - 1);
        }
    }
}
