public abstract class Ordenar {
    public static String[][] ordenar(String populacao[][]) {
        String populacaoOrdenada[][] = new String[10][4];

        double aux = Double.parseDouble(populacao[0][3]);
        int indice = 0, linha = 0;
        do {
            for (int i = 0; i < populacao.length ; i++) {
                if (populacao[i][3] != null) {
                    if (aux < Double.parseDouble(populacao[i][3])) {
                        aux = Double.parseDouble(populacao[i][3]);
                        indice = i;
                    }
                }
            }
            for (int j = 0; j < 4; j++) {
                populacaoOrdenada[linha][j] = populacao[indice][j];
                populacao[indice][j] = null;
            }
            for (int i = 0; i < populacao.length; i++) {
                if (populacao[i][0] != null) {
                    aux = Double.parseDouble(populacao[i][3]);
                    indice = i;
                    break;
                }
            }
            linha++;
        } while (populacaoOrdenada[9][0] == null);
        return populacaoOrdenada;
    }
}
