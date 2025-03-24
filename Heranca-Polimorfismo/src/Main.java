public class Main {
    public static void main(String[] args) {
        Colaboarador colaboarador = new Colaboarador();
        Gerente gerente = new Gerente();

        gerente.setNome("Joao");
        gerente.setUsuario("jao");
        gerente.setSenha("123456");

        System.out.println(gerente.getNome());
        System.out.println(gerente.getUsuario());
        System.out.println(gerente.getSenha());
    }
}
