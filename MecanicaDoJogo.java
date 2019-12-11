package scrambledWords;
public interface MecanicaDoJogo {

    public String getNome();

    public String getPalavraEmbaralhada();

    public boolean acertou(String respostaDoUsuario);

    public boolean temTentativas();

    public boolean terminouJogo();

    public int getPontuacao();

    public int getTentativas();

    public int getErros();

    public String getPalavraDaVez();

}

