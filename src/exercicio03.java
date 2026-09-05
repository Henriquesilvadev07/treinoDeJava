import java.util.Scanner;

public class exercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a senha: ");
        String senha = sc.nextLine();
        if (senha.length() >= 8){
            System.out.println("Senha com tamanho suficiente e seguro");
        }else {
            System.out.println("A senha tem menos que 8 digitos, crie outra senha!");
        }
        sc.close();
    }
}
