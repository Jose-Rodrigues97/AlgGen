import java.util.Random;

public abstract class GerarPopulacao {
    public static String[][] popular(String populacao[][]) {
        Random random = new Random();
        String ANSI_RED = "\u001B[31m";
        String ANSI_RESET = "\u001B[0m";
        int gene1, gene2;
        for (int i = 0; i < populacao.length; i++) {
            gene1 = random.nextInt(2);
            gene2 = random.nextInt(2);
            populacao[i][2] = populacao[i][2] + ANSI_RED + Integer.toString(gene1) + Integer.toString(gene2) + ANSI_RESET;
        }
        return populacao;
    }
}
