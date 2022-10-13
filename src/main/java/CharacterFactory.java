import lotr.Character;
import org.reflections.Reflections;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class CharacterFactory {

    public static Character createCharacter() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Reflections reflections = new Reflections("lotr");
        Set<Class<? extends Character>> subTypes =  reflections.getSubTypesOf(Character.class);
        List<Character> characterList = new ArrayList<>();

        for (Class<? extends Character> chr : subTypes) {
            if (!Modifier.isAbstract(chr.getModifiers())) {
                characterList.add(chr.getDeclaredConstructor().newInstance());
            }
        }

        return characterList.get(new Random().nextInt(characterList.size()));
    }
}
