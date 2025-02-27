import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        // Solicitando dados da conta ao usuário
        System.out.println("Por favor, digite o número da conta:");
        int numero = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha

        System.out.println("Por favor, digite o número da agência:");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite seu nome:");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite seu sobrenome:");
        String sobreNome = scanner.nextLine();

        System.out.println("Por favor, digite seu saldo:");
        double saldo = scanner.nextDouble();

        // Exibindo os dados da conta bancária
        System.out.println("\nOlá, " + nomeCliente +  sobreNome + "! Obrigado por criar uma conta em nosso banco.");
        System.out.println("Sua agência é " + agencia + ", conta " + numero + " e seu saldo R$" + saldo + " já está disponível para saque.");

        scanner.close();
    }
}

