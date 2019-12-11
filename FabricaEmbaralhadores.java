package scrambledWords;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class FabricaEmbaralhadores {

    List<Embaralhador> embaralhadores;

    public FabricaEmbaralhadores() {
        embaralhadores = new ArrayList();
        embaralhadores.add(new EmbaralhadorRandom());
        embaralhadores.add(new EmbaralhadorParImpar());
    }

    public Embaralhador getEmbaralhador() {

        Random getEmbaralhador = new Random();
        int posicao = getEmbaralhador.nextInt(2);

        return embaralhadores.get(posicao);

    }

}