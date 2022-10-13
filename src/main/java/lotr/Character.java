package lotr;

import lombok.Data;

@Data
public abstract class Character {
    private int power;
    private int hp;

    public Character(int hp, int power) {
        this.power = power;
        this.hp = hp;
    }

    public abstract void kick(Character c);

    public boolean isAlive() {
        return getHp() > 0;
    }

    public int getHp() {
        return this.hp;
    }

    public void setHp(int hp) {
        if (hp < 0) {
            this.hp = 0;
        } else {
            this.hp = hp;
        }
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{" +
                "hp=" + hp +
                ", power=" + power +
                '}';
    }
}
