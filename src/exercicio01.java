import java.util.Scanner;

public class exercicio01 {
    public static void main(String[] args) {

        String email = "henriquedev";
        String senha = "Maracuja@2020";
        Scanner sc = new Scanner(System.in);

        System.out.println("Olá, Digite o seu login: ");
        String resposta = sc.nextLine();
        if (resposta.equals(email)) {
            System.out.println("Email Correto, Prossiga para a senha: ");
        }else{
            System.out.println("Email INCORRETO SEU MINTIROSO SAFADO!");
            System.exit(0);
        }
        System.out.println("Agora digite sua senha: ");
        String resposta2 = sc.nextLine();
        if (resposta2.equals(senha)){
            System.out.println("Ok, Logado com sucesso.....passou dessa vez");
        }else{
            System.out.println("Senha errada seu vagabundo mentiroso");
            System.exit(0);
        }
        System.out.println("Ate Logo!!");





    }
}
