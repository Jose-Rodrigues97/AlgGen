public abstract class Print {
    public static void printar(String populacao[][]) {
        String ANSI_RESET = "\u001B[0m";
        String ANSI_GREEN = "\u001B[32m";
        String ANSI_RED = "\u001B[31m";
        for (int i = 0; i < populacao.length; i++) {
            for (int j = 0; j < 4; j++) {
                if (j == 3) {
                    System.out.println(populacao[i][j]);
                    if (populacao[i][j] != null) {
                        populacao[i][j] = populacao[i][j].replace(ANSI_RESET, "").replace(ANSI_RED, "").replace(ANSI_GREEN, "");
                    }
                } else {
                    System.out.print(populacao[i][j] + ", ");
                    if (populacao[i][j] != null) {
                        populacao[i][j] = populacao[i][j].replace(ANSI_RESET, "").replace(ANSI_RED, "").replace(ANSI_GREEN, "");
                    }
                }
            }
        }
    }
}
