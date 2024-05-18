package Restaurant.Decorator;

public class NotaCuFelicitare extends NotaDecorator{
    public NotaCuFelicitare(INota decorareNota) {
        super(decorareNota);
    }

    @Override
    public void print() {
        decorareNota.print();
        printFelicitare();
    }

    private void printFelicitare() {
        System.out.println("Felicitare: La multi ani!");
    }
}
