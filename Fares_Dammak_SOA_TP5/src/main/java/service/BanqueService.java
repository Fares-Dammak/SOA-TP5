package service;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import metier.Compte;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@WebService
public class BanqueService {
    @WebMethod
    //la methode conversion convertir un montant du euro au dinar a comme parametre un montant double
    public double conversion(@WebParam double mt){
        return mt*3.3;
    }
    @WebMethod
    //la methode get comptes retourne liste des comptes
    public List<Compte> getComptes(){
        List<Compte> comptes = new ArrayList<Compte>();
        Compte c1 = new Compte();
        Compte c2 = new Compte(10,13.2,new Date());
        comptes.add(c1);
        comptes.add(c2);
        return comptes;
    }
}
