package Spital.Singleton;

public class Program {
    public static void main(String[]args){
        Preparat p1 = new Preparat("paine",23,200);
        Preparat p2 = new Preparat("vita",15,280);
        Preparat p3 = new Preparat("pizza",13,299);

        Cuptor.getInstance(300).addPreparat(p1);
        Cuptor.getInstance(300).addPreparat(p2);
        Cuptor.getInstance(300).addPreparat(p3);

        System.out.println(Cuptor.getInstance(300));
    }
}
