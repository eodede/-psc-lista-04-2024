import java.util.Scanner;

public class População2 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        char repetir;
        
        do {
        int populacaoA, populacaoB;
        double taxaCrescimentoA, taxaCrescimentoB;
            
        do {
        System.out.print("Informe a população inicial do país A: ");
        populacaoA = scanner.nextInt();
        if (populacaoA <= 0) {
        System.out.println("Por favor, informe um valor maior que zero.");
        }

        } while (populacaoA <= 0);
        do {
        System.out.print("Informe a população inicial do país B: ");
        populacaoB = scanner.nextInt();
        if (populacaoB <= 0) {
        System.out.println("Por favor, informe um valor maior que zero.");
        }

        } while (populacaoB <= 0);
        do {
        System.out.print("Informe a taxa de crescimento anual do país A (em decimal): ");
        taxaCrescimentoA = scanner.nextDouble();
        if (taxaCrescimentoA <= 0) {
        System.out.println("Por favor, informe um valor maior que zero.");
        }

        } while (taxaCrescimentoA <= 0); 
        do {
        System.out.print("Informe a taxa de crescimento anual do país B (em decimal): ");
        taxaCrescimentoB = scanner.nextDouble();
        if (taxaCrescimentoB <= 0) {
        System.out.println("Por favor, informe um valor maior que zero.");
        }

        } while (taxaCrescimentoB <= 0);
        int anos = 0;
        while (populacaoA <= populacaoB) {
        populacaoA += populacaoA * taxaCrescimentoA;
        populacaoB += populacaoB * taxaCrescimentoB;
        anos++;
        }
            System.out.println("Número de anos necessários para que a população de A ultrapasse ou iguale a população de B: " + anos);
            System.out.print("Deseja calcular novamente? (S/N): ");
            repetir = scanner.next().charAt(0);
        } while (repetir == 'S' || repetir == 's');
        
        scanner.close();
    }
}