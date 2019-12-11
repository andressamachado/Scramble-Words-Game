package scrambledWords;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BancoDePalavras {

    List<String> listaPalavras = new ArrayList<>();
    private String ultimaExibida;

    public BancoDePalavras() {

        this.ultimaExibida = "";
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("D:\\2019F\\CST8221_JavaApplicationProgramming\\Labs&Assignments\\Assignment2Part2-ClientServerChatApplication\\ScrambledWordsGame\\src\\scrambledWords\\BancoDePalavras\\palavras.txt"));
            String palavra;
            while ((palavra = br.readLine()) != null) {
                listaPalavras.add(palavra);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    public String getPalavraGerada() {

        Random geradorAleatorio = new Random();
        this.ultimaExibida = listaPalavras.get(geradorAleatorio.nextInt(30));
        return this.ultimaExibida;
    }
}

