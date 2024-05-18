package Restaurant.Decorator;

public class Program {
    public static void main(String[] args) {
        INota notaDePlata = new NotaDePlata("Andrei Costache", 250.0);
        INota notaCuFelicitare = new NotaCuFelicitare(notaDePlata);

        // Printam nota de plata cu felicitare
        notaCuFelicitare.print();
    }
}
