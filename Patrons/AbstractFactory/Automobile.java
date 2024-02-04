package Patrons.AbstractFactory;

import java.time.LocalDate;
import java.util.ArrayList;

public class Automobile extends Vehicule {

    public Automobile(String id, String nom, ArrayList<String> options,
            ArrayList<String> animations, int prix, ArrayList<String> images) {
        super(id, nom, options, animations, prix, images);
        this.type= "Automobile";
    }
    
}
