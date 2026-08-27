import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome = "";
        String cidade = "";
        int idade;
        System.out.println("Digite seu nome: ");
       nome = sc.nextLine();
        System.out.println("Perfeito " +nome+ ", Agora digite a sua cidade: ");
        cidade = sc.nextLine();
        System.out.println("Muito legal " +nome+ "!! A cidade de " +cidade+ " é realmente Muito legal!");
        System.out.println("Agora digite a sua idade");
        idade = sc.nextInt();
        if (idade >= 0 || idade <= 17) {
            System.out.println("Ah que bacana! voce ainda esta no auge da juventude");
        } else if (idade >= 18 || idade <= 59) {
            System.out.println("Que legal! voce já é um adulto!");
        } else if (idade >= 60) {
            System.out.println("Bacana! voce ja viveu muitas histórias para contar!");
        };
        System.out.println("foi muito legal conversar com voce, talvez podemos conversar novamente algum dia, pode ser?");
        System.out.println("Até logo!");

    }

}