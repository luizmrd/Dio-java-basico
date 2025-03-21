// Para ler e escrever dados em Java, aqui na DIO padronizamos da seguinte forma: 
// - new Scanner(System.in): cria um leitor de Entradas, com métodos úteis com prefixo "next";
// - System.out.println:.imprime um texto de Saída (Output) e pulando uma linha.  

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada do saldo inicial
        double saldoInicial = scanner.nextDouble();

        // Entrada das três transações
        double valorDeTransacao1 = scanner.nextDouble();
        double valorDeTransacao2 = scanner.nextDouble();
        double valorDeTransacao3 = scanner.nextDouble();

        // Cálculo do saldo final
        double saldoFinal = saldoInicial + valorDeTransacao1 + valorDeTransacao2 + valorDeTransacao3;

        // Exibição do saldo final com duas casas decimais
        System.out.printf("%.2f\n", saldoFinal);

        // Fechando o scanner
        scanner.close();
    }
}
