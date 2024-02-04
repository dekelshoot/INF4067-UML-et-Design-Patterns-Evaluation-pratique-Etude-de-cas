package Patrons.AbstractFactory;

import java.util.ArrayList;

public class AutomobileEssence extends Automobile {
    
    public AutomobileEssence(String id, String nom, ArrayList<String> options,
            ArrayList<String> animations, int prix, ArrayList<String> images) {
        super(id, nom, options, animations, prix, images);
        this.carburation= "Essence";
    }
}
