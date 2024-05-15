package Restaurant.FactoryMethod;

public interface IFactory {
    ISupe creareSupa(ESupe tipSupa) throws IllegalAccessException;
}
