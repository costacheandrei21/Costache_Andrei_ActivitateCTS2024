package Restaurant.FactoryMethod;

public class Program {
    public static void main(String[] args) throws IllegalAccessException {
        IFactory factory = new FactorySupe();
        ISupe supaLegume = factory.creareSupa(ESupe.SUPA_LEGUME);
        supaLegume.afisareDescriere();
        ISupe supaCiuperci = factory.creareSupa(ESupe.SUPA_CIUPERCI);
        supaCiuperci.afisareDescriere();
        ISupe supaVita = factory.creareSupa(ESupe.SUPA_VITA);
        supaVita.afisareDescriere();

    }
}
