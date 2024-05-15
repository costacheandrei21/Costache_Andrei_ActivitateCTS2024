package Restaurant.Builder;

public class RezervareBuilder implements IBuilder{
    private Rezervare rezervare;
    @Override
    public Rezervare build() {
        return rezervare;
    }
    public RezervareBuilder(){
        rezervare = new Rezervare(true,true,true,true,true);
    }
    public RezervareBuilder setAsezareGeam(boolean asezareGeam){
        this.rezervare.setAsezareGeam(asezareGeam);
        return this;
    }
    public RezervareBuilder setScauneErgonomice(boolean scauneErgonomice){
        this.rezervare.setScauneErgonomice(scauneErgonomice);
        return this;
    }
    public RezervareBuilder setDecorareaMesei(boolean decorareaMesei){
        this.rezervare.setDecorareaMesei(decorareaMesei);
        return this;
    }
    public RezervareBuilder setMuzicaAmbientala(boolean muzicaAmbientala){
        this.rezervare.setMuzicaAmbientala(muzicaAmbientala);
        return this;
    }
    public RezervareBuilder setGenMuzica(boolean genMuzica){
        this.rezervare.setGenMuzica(genMuzica);
        return this;
    }
}
