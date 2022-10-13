import lotr.Character;

public class Demo {

    public static void main(String[] args) throws Exception {
        Character c1 = CharacterFactory.createCharacter();
        Character c2 = CharacterFactory.createCharacter();

        GameManager gameManager = new GameManager();
        gameManager.fight(c1, c2);
    }
}
