import java.util.Scanner;

public class UsuarioeSenha {
    public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);

    while (true) {
    System.out.println("Usuário: ");
    String usuario = scanner.nextLine();

    System.out.println("Senha: ");
    String senha = scanner.nextLine();

    if (!senha.equals(usuario)) {
    System.out.println("Bem vindo(a)");
    break;
    }
    else
    System.err.println("O Usuário não pode ser igual a senha!");
    }
    scanner.close();
    }
}
