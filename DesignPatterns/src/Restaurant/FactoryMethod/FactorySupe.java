package Restaurant.FactoryMethod;

public class FactorySupe implements IFactory{
    @Override
    public ISupe creareSupa(ESupe tipSupa) throws IllegalAccessException {
        switch (tipSupa){
            case SUPA_VITA:
                return new SupaVita();
            case SUPA_CIUPERCI:
                return new SupaCiuperci();
            case SUPA_LEGUME:
                return new SupaLegume();
            default:
                throw new IllegalAccessException("Unknown soup type: "+ tipSupa);
        }
    }
}
