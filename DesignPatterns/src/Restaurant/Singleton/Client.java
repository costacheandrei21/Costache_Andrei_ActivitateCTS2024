package Restaurant.Singleton;

public class Client {
    private String nume;
    private String email;
    private Client(String nume, String email){
        this.nume = nume;
        this.email= email;
        try{
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public static Client creareClient(String nume, String email){
        return new Client(nume,email);
    }

    @Override
    public String toString() {
        return "Client{" +
                "nume='" + nume + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
