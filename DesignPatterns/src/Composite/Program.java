package Composite;

public class Program {
    public static void main(String[] args){
        Structura structuraMeniu = new Structura("Meniu restaurant");
        Meniu meniu = new Meniu(structuraMeniu,"Good Food");

        //definire nivel 1
        ANod structuraStartere = new Structura("Startere");
        ANod structuraBauturi = new Structura("Bauturi");
        ANod structuraDesert = new Structura("Desert");
        structuraMeniu.adaugaNod(structuraStartere);
        structuraMeniu.adaugaNod(structuraBauturi);
        structuraMeniu.adaugaNod(structuraDesert);

        //definire nivel 2
        structuraBauturi.adaugaNod(new MeniuItems("Apa plata",6));
        structuraBauturi.adaugaNod(new MeniuItems("Apa minerala",12));
        structuraBauturi.adaugaNod(new MeniuItems("Pepsi",10));
        structuraDesert.adaugaNod(new MeniuItems("Lava cake",25));

        System.out.println(meniu.getNumeRestaurant());
        System.out.println(structuraMeniu.getInfo());
    }
}
