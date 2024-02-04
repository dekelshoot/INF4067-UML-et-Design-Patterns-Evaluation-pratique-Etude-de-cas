package Patrons.AbstractFactory;

import java.time.LocalDate;
import java.util.ArrayList;

abstract class Vehicule{
    public String id;
    public String type;
    public String nom;
    public String carburation;
    public ArrayList<String> options;
    public ArrayList<String> animations;
    public int prix;
    public ArrayList<String> images;
    public LocalDate dateAjout;

    public Vehicule(String id, String nom,  ArrayList<String> options, ArrayList<String> animations,int prix,ArrayList<String> images){
        this.id = id;
        this.nom = nom;
        this.options = options;
        this.animations = animations;
        this.prix = prix;
        this.images = images;
        this.dateAjout=  LocalDate.now();
    }

    public void afficherVehicule(){
        System.out.println("\n\t type: " + this.type+"\n\t id: "+this.id+"\n\t nom: " + this.nom+"\n\t carburation: "+this.carburation+"\n\t prix: " + this.prix+"\n\t date d'ajout: "+this.dateAjout+"\n\t options: " );
        for (String element : this.options) {
            System.out.println("\t\t - " + element);
        }
        System.out.println("\t images: " );
        for (String element : this.images) {
            System.out.println("\t\t - " + element);
        }
    }
}