package Patrons.AbstractFactory;

import java.time.LocalDate;
import java.util.ArrayList;

public class Scooter extends Vehicule {
    
    public Scooter(String id, String nom, String carburation, ArrayList<String> options,
            ArrayList<String> animations, int prix, ArrayList<String> images) {
        super(id, nom, options, animations, prix, images);
        this.type= "Sooter";
    }
    
}
