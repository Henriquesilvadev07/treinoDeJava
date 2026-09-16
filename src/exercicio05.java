import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class exercicio05 {
    public static void main(String[] args) {
        LocalDate hoje = LocalDate.now();
        LocalDate fimDoAno = LocalDate.of(hoje.getYear(), 12, 31);

        Long diasRestantes = ChronoUnit.DAYS.between(hoje, fimDoAno);

        System.out.println("Faltam " +diasRestantes+ " Dias para o fim do ano");
    }

}
