public class Usuario {
    public static void main(String[] args) throws Exception {
       
        SmarTv smarTv = new SmarTv();

        smarTv.diminurVolume();
        smarTv.diminurVolume();
        smarTv.diminurVolume();
        smarTv.aumentarVolume();

        smarTv.mudarCanal(13);

        System.out.println("Tv Ligada ? " + smarTv.ligada);
        System.out.println("canal Atual: " + smarTv.canal);
        System.out.println("Volume Atual: " + smarTv.volume);

        smarTv.ligar ();
        System.out.println("Novo Status - Tv LIgada ? " + smarTv.ligada);
    }
}
