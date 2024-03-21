import java.util.Scanner;

public class CincoNumSM {
    public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite o 1º número: ");
    Double num1 = scanner.nextDouble();

    System.out.print("Digite o 2º número: ");
    Double num2 = scanner.nextDouble();

    System.out.print("Digite o 3º número: ");
    Double num3 = scanner.nextDouble();

    System.out.print("Digite o 4º número: ");
    Double num4 = scanner.nextDouble();

    System.out.print("Digite o 5º número: ");
    Double num5 = scanner.nextDouble();
    
    Double soma = (num1 + num2 + num3 + num4 + num5);
    Double media = (num1 + num2 + num3 + num4 + num5) / 5;
    System.out.println("A soma é: " + soma);
    System.out.println("A média é: " + media);  
    scanner.close();
    }
}