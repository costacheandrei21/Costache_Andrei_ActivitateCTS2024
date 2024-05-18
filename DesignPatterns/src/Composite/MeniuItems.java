package Composite;

public class MeniuItems extends ANod{
    String denumire;
    int pret;

    public MeniuItems(String denumire, int pret){
        this.denumire = denumire;
        this.pret = pret;
    }
    @Override
    public String getDenumire() {
        return this.denumire;
    }

    @Override
    public int getPret() {
        return this.pret;
    }
}
