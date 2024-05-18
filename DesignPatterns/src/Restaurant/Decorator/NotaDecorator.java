package Restaurant.Decorator;

public abstract class NotaDecorator implements INota{
    protected INota decorareNota;
    public NotaDecorator(INota decorareNota){
        this.decorareNota = decorareNota;
    }

    @Override
    public void print() {
        decorareNota.print();
    }
}
