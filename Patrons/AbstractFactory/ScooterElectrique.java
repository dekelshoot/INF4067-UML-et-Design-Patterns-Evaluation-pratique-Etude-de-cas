package Patrons.AbstractFactory;

import java.util.ArrayList;

public class ScooterElectrique extends Scooter {

    public ScooterElectrique(String id, String nom, String carburation, ArrayList<String> options,
            ArrayList<String> animations, int prix, ArrayList<String> images) {
        super(id, nom, carburation, options, animations, prix, images);
        this.carburation = "Electrique";
    }
    
}
