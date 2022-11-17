import java.util.HashSet;
import java.util.Random;
public abstract class Mutacao {
    public static String[][] mutar(String populacao[][]) {
        Random random = new Random();
        int gene, coluna;
        String ANSI_RED = "\u001B[31m";
        String ANSI_RESET = "\u001B[0m";
        HashSet<Integer> linhasDifentes = new HashSet<>();
        do {
            linhasDifentes.add(random.nextInt(10));
        } while (linhasDifentes.size() < 5);
        for (int i = 0; i < populacao.length; i++) {
            if (linhasDifentes.contains(i)) {
                gene = random.nextInt(2);
                coluna = random.nextInt(6);
                populacao[i][2] = populacao[i][2].substring(0, coluna) + ANSI_RED + gene + ANSI_RESET + populacao[i][2].substring(coluna+1, populacao[i][2].length());
            }
        }
        return populacao;
    }
}
