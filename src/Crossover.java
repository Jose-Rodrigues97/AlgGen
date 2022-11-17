public abstract class Crossover {
    public static String[][] cruzar(String populacao[][]) {
        for (int i = 0; i < populacao.length; i++) {
            populacao[i][2] = (populacao[i][2]).substring(0, 4);
        }
        return populacao;
    }
}
