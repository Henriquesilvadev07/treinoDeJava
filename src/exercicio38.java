public class exercicio38 {
    public static double calcularMedia(double nota1, double nota2, double nota3) {
        return (nota1 + nota2 + nota3) / 3.0;
    }
    public static String verificarSituacao(double media) {
        if (media >= 7.0) {
            return "Aprovado";
        } else if (media >= 5.0) {
            return "Exame";
        }
        return "Reprovado";
    }

    public static void main(String[] args) {

    }
}
