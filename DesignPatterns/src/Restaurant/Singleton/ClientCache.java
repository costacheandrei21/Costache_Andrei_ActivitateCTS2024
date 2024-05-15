package Restaurant.Singleton;

import java.util.HashMap;
import java.util.Map;

public class ClientCache {
    private Map<String,Client> clienti;
    private static ClientCache instance;
    private ClientCache(){
        clienti = new HashMap<>();
    }
    public static synchronized ClientCache getInstance(){
        if(instance == null){
            instance = new ClientCache();
        }
        return instance;
    }
    public Client getClient(String email){
        return clienti.get(email);
    }
    public void addClient(String email, Client client){
        clienti.put(email,client);
    }
}
