package serveur;

import jakarta.xml.ws.Endpoint;
import service.BanqueService;

public class ServeurJWS {
    public static void main(String[] args) {
        //url pour WebService
        String url=" http://localhost:8084/";
        Endpoint.publish(url,new BanqueService());
    }
}
