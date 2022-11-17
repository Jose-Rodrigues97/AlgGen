import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Integer populacoes = 0;
        String x, y, insercaoManual;
        String populacao[][] = new String[10][4];
        Boolean objetivo = false;
        try (Scanner teclado = new Scanner(System.in)) {
            System.out.println("###Crie uma população###");
            System.out.println("Setar valores ou inserir o padrão? S ou P");
            insercaoManual = teclado.nextLine();
            switch (insercaoManual) {
                case "S":
                    for (int i = 0; i < populacao.length; i++) {
                        System.out.println("Insira valores entre 0 e 7 para X e Y - " + i);
                        System.out.print("X: ");
                        populacao[i][0] = teclado.nextLine();
                        System.out.print("Y: ");
                        populacao[i][1] = teclado.nextLine();
                    }
                    break;
                case "P":
                    populacao[0][0] = "3";
                    populacao[0][1] = "6";
                    populacao[1][0] = "6";
                    populacao[1][1] = "4";
                    populacao[2][0] = "3";
                    populacao[2][1] = "5";
                    populacao[3][0] = "7";
                    populacao[3][1] = "0";
                    populacao[4][0] = "3";
                    populacao[4][1] = "7";
                    populacao[5][0] = "1";
                    populacao[5][1] = "6";
                    populacao[6][0] = "1";
                    populacao[6][1] = "2";
                    populacao[7][0] = "5";
                    populacao[7][1] = "4";
                    populacao[8][0] = "6";
                    populacao[8][1] = "1";
                    populacao[9][0] = "4";
                    populacao[9][1] = "2";
                    break;

                default:
                    System.out.println("Texto inválido");
                    break;
            }
        }
        System.out.println("População");
        Print.printar(populacao);

        System.out.println("População com cromossomos");
        for (int i = 0; i < populacao.length; i++) {
            x = Converter.paraBinário(populacao[i][0]);
            y = Converter.paraBinário(populacao[i][1]);
            populacao[i][2] = Cromossomo.cromossomos(x, y);
        }
        Print.printar(populacao);

        do {
            populacoes++;
            System.out.println("População com cromossomos e cálculo objetivo - N" + populacoes);
            for (int i = 0; i < populacao.length; i++) {
                populacao[i][3] = Integer.toString(Diferencial.calcularDiferencial(Integer.parseInt(populacao[i][0]),
                        Integer.parseInt(populacao[i][1])));
            }
            for (int i = 0; i < populacao.length; i++) {
                if (populacao[i][0] == "2") {
                    if (populacao[i][1] == "3") {
                        objetivo = true;
                        String ANSI_GREEN = "\u001B[32m";
                        String ANSI_RESET = "\u001B[0m";
                        populacao[i][0] = ANSI_GREEN + populacao[i][0];
                        populacao[i][1] = populacao[i][1];
                        populacao[i][2] = populacao[i][2];
                        populacao[i][3] = populacao[i][3] + ANSI_RESET;
                    }
                }
            }
            Print.printar(populacao);
            if (objetivo) {
                break;
            }
            System.out.println("Ordenando indivíduos");
            Print.printar(populacao = Ordenar.ordenar(populacao));

            System.out.println("Realizando corte");
            Print.printar(populacao = Cortar.cortar(populacao));

            System.out.println("Realziando roleta viciada");
            Print.printar(populacao = RoletaViciada.gerar(populacao));

            System.out.println("Realizando crossover");
            Print.printar(populacao = Crossover.cruzar(populacao));

            System.out.println("Gerando nova população");
            Print.printar(populacao = GerarPopulacao.popular(populacao));

            System.out.println("Realizando mutação");
            Print.printar(populacao = Mutacao.mutar(populacao));

            System.out.println("Recalculando variáveis da nova população");
            for (int i = 0; i < populacao.length; i++) {
                populacao[i][0] = Converter.paraVariavel(populacao[i][2].substring(0, 3));
                populacao[i][1] = Converter.paraVariavel(populacao[i][2].substring(3, 6));
            }
            Print.printar(populacao);
        } while (objetivo == false);
    }
}