package Restaurant.Singleton;

public class Program {
    public static void main(String[] args) {
        ClientCache cache = ClientCache.getInstance();

        String email = "test@test.com";
        Client client1 = Client.creareClient("Andrei Costache", email);
        cache.addClient(email, client1);

        Client cachedClient = cache.getClient(email);
        System.out.println(cachedClient);

        long startTime = System.currentTimeMillis();
        Client client2 = cache.getClient(email);
        long endTime = System.currentTimeMillis();
        System.out.println("Timp pentru recuperare din cache: " + (endTime - startTime) + " ms");
        System.out.println(client2);
    }
}
