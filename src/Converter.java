public abstract class Converter {
    public static String paraBinário(String num) {
        String convercao = "";
        switch (num) {
            case "0":
                convercao = "000";
                break;
            case "1":
                convercao = "001";
                break;
            case "2":
                convercao = "010";
                break;
            case "3":
                convercao = "011";
                break;
            case "4":
                convercao = "100";
                break;
            case "5":
                convercao = "101";
                break;
            case "6":
                convercao = "110";
                break;
            case "7":
                convercao = "111";
                break;

            default:
                System.out.println("Número inválido");
                break;
        }
        return convercao;
    }

    public static String paraVariavel(String binario) {
        String convercao = "";
        switch (binario) {
            case "000":
            convercao = "0";
                break;
            case "001":
            convercao = "1";
                break;
            case "010":
            convercao = "2";
                break;
            case "011":
            convercao = "3";
                break;
            case "100":
            convercao = "4";
                break;
            case "101":
            convercao = "5";
                break;
            case "110":
            convercao = "6";
                break;
            case "111":
            convercao = "7";
                break;

            default:
                System.out.println("Número inválido");
                break;
        }
        return convercao;
    }
}
