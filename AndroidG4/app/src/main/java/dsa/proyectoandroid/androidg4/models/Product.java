package dsa.proyectoandroid.androidg4.models;

public class Product {
    private String id;
    private String nom;
    private String price;

    public Product(String id, String nom, String price) {
        this.id = id;
        this.nom = nom;
        this.price = price;
    }

    public Product() {
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

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
