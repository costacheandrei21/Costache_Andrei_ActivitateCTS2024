package Restaurant.Builder;

public class Program {
    public static void main(String[ ]args){
        RezervareBuilder builder = new RezervareBuilder();
        Rezervare rezervare = builder.setAsezareGeam(true).setScauneErgonomice(true).setDecorareaMesei(false).setMuzicaAmbientala(true).setGenMuzica(false).build();
        System.out.println(rezervare);
    }
}
