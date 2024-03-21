import java.util.Scanner;

public class CincoNumeros {
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

    if (num1 > num2 && num1 > num3 && num1 > num4 && num1 > num5)
    System.out.println("O 1º número é o maior!: " + num1);
    else if (num2 > num1 && num2 > num3 && num2 > num4 && num2 > num5)
    System.out.println("O 2º número é o maior!: " + num2);
    else if (num3 > num1 && num3 > num2 && num3 > num4 && num3 > num5)
    System.out.println("O 3º número é o maior!: " + num3);
    else if (num4 > num1 && num4 > num2 && num4 > num3 && num4 > num5)
    System.out.println("O 4º número é o maior!: " + num4);
    else if (num5 > num1 && num5 > num2 && num5 > num3 && num2 > num4)
    System.out.println("O 5º número é o maior!: " + num5);
    }
}
