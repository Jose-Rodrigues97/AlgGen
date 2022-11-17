public abstract class Cortar {
    public static String[][] cortar(String populacao[][]) {
        for (int i = 4; i < populacao.length; i++) {
            for (int j = 0; j < 4; j++) {
                populacao[i][j] = null;   
            }
        }
        return populacao;
    }
}
