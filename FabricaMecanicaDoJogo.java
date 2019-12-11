package scrambledWords;
public class FabricaMecanicaDoJogo {

    private static MecanicaDoJogo mecanicaDoJogo;

    public static MecanicaDoJogo getMecanicaDoJogo() {
        return mecanicaDoJogo;
    }

    public static void set(int nivelJogo) {

        switch (nivelJogo) {
            case 1:
                FabricaMecanicaDoJogo.mecanicaDoJogo = new MecanicaFacil();
                break;
            case 2:
                FabricaMecanicaDoJogo.mecanicaDoJogo = new MecanicaDificil();
                break;
        }
    }

}
