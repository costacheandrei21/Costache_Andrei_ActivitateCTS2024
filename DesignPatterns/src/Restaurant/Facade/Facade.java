package Restaurant.Facade;

public class Facade {
    private GestiuneMasaLibera gestiuneMasaLibera;
    private GestiuneMasaCurata gestiuneMasaCurata;
    private GestiuneServeteleMasa gestiuneServeteleMasa;

    public Facade(){
        this.gestiuneMasaLibera = new GestiuneMasaLibera();
        this.gestiuneMasaCurata = new GestiuneMasaCurata();
        this.gestiuneServeteleMasa = new GestiuneServeteleMasa();
    }

    public boolean masaGata(int id){
        if (!gestiuneMasaLibera.masaLibera(id)){
            return false;
        }
        if (!gestiuneMasaCurata.masaCurata(id)){
            return false;
        }
        if (!gestiuneServeteleMasa.serveteleNoi(id)){
            return false;
        }
        return true;
    }
}
