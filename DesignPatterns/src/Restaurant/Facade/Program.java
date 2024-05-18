package Restaurant.Facade;

public class Program {
    public static void main(String[] args){
        Facade restaurant = new Facade();
        int id = 1;
        if(restaurant.masaGata(id)){
            System.out.println("Masa " + id + " este gata!");
        }else{
            System.out.println("Masa " + id + " nu este gata!");
        }
    }
}
