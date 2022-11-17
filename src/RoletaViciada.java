public abstract class RoletaViciada {
    public static String[][] gerar(String populacao[][]) {
        String novaPopulacao[][] = new String[10][4];
        for (int i = 0; i < 4; i++) {
            if (i == 0) {
                for (int j = 0; j < 4; j++) {
                    novaPopulacao[j][2] = (populacao[i][2]);
                }
            } else if (i == 1) {
                for (int j = 4; j < 7; j++) {
                    novaPopulacao[j][2] = (populacao[i][2]);
                }
            } else if (i == 2) {
                for (int j = 7; j < 9; j++) {
                    novaPopulacao[j][2] = (populacao[i][2]);
                }
            } else if (i == 3) {
                novaPopulacao[9][2] = (populacao[i][2]);
            }

        }
        return novaPopulacao;
    }
}