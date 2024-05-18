package Restaurant.Decorator;

public class NotaDePlata implements INota{
    private String numeClient;
    private double sumaPlata;
    public NotaDePlata(String numeClient, double sumaPlata){
        this.numeClient = numeClient;
        this.sumaPlata = sumaPlata;
    }
    @Override
    public void print() {
        System.out.println("Nota de plata pentru clientul " + numeClient + ": " + sumaPlata + " RON.");
    }
}
