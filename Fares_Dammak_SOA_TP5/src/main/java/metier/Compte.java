package metier;

import java.util.Date;

public class Compte {
    //les atributs du class Compte
    private int code;
    private double solde;
    private Date date_de_création;

    //constructeur par defaut
    public Compte (){}
    //constructeur avec parametre
    public Compte(int code, double solde, Date date_de_création){
        this.code=code;
        this.solde=solde;
        this.date_de_création = date_de_création;
    }
    //geters et seters
    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public Date getDate_de_création() {
        return date_de_création;
    }

    public void setDate_de_création(Date date_de_création) {
        this.date_de_création = date_de_création;
    }
}
