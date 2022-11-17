public abstract class Diferencial {
    public static Integer calcularDiferencial(int x, int y) {
        double a = x - 2, b = y - 3;
        double calculo = 2 - (a * a) - (b * b);
        return (int)calculo;
    }
}
