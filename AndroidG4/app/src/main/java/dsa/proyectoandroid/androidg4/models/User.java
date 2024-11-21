package dsa.proyectoandroid.androidg4.models;

import java.util.UUID;

public class User {
    private String id;
    private String nom;
    private String paswrd;

    public User(String id, String nom, String paswrd) {
        if(id==null || id.isEmpty()) this.id = UUID.randomUUID().toString();
        else this.id = id;
        this.nom = nom;
        this.paswrd = paswrd;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPaswrd() {
        return paswrd;
    }

    public void setPaswrd(String paswrd) {
        this.paswrd = paswrd;
    }
}
