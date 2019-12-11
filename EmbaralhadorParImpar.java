package scrambledWords;

public class EmbaralhadorParImpar implements Embaralhador {


    @Override
    public String embaralhador(String input) {

        StringBuilder output = new StringBuilder(input.length());

        for (int i = 0; i < input.length(); i++) {
            if (i % 2 != 0) {
                output.append(input.charAt(i));
                output.append(input.charAt(i - 1));
            } else if (i == input.length()-1) {
                output.append(input.charAt(i));
            }
        }
        return output.toString();
    }

}
