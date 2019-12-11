package scrambledWords;

import java.util.ArrayList;
import java.util.List;

public class EmbaralhadorRandom implements Embaralhador {


    @Override
    public String embaralhador(String input) {

        List<Character> characters = new ArrayList<Character>();

        for (char letra : input.toCharArray()) {
            characters.add(letra);
        }

        StringBuilder output = new StringBuilder(input.length());

        while (characters.size() != 0) {
            int randPicker = (int) (Math.random() * characters.size());
            output.append(characters.remove(randPicker));
        }
        return output.toString();
    }
}
