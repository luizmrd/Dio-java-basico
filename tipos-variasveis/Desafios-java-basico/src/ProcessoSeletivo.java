public class ProcessoSeletivo {
    public static void main(String[] args) {
        System.out.println("Processo Seletivo");

        double salarioCandidato = 2500.0;

        if (salarioCandidato == 2000.0)
            System.out.println("RH: Ligar para o candidato");

        else if (salarioCandidato <= 2000.0)
            System.out.println("RH: Ligar para o candidato e passar a contraproposta");

        else
            System.out.println("RH: Candidado reprovado");

    }

}
