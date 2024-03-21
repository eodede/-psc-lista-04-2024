import java.util.Scanner;

public class UmaVinte {
    public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    int numero = 1;

    while (numero <= 20) {
    System.out.println(numero);
    numero++;
    }
    scanner.close();
    }
}
