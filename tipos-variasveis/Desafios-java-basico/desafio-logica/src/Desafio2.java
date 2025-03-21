import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double saldoCliente = scanner.nextDouble();
       
            if (saldoCliente < 0) {
                System.out.println("Negativado");
            } else if (saldoCliente >= 0 && saldoCliente <= 500) {
                System.out.println("Baixo");
            } else{ 
                System.out.println("Confortavel");
            }     
       
            System.out.println(saldoCliente);
            scanner.close();

    }
}
