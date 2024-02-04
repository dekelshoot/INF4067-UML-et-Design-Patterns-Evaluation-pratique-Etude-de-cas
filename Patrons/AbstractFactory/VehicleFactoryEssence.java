package Patrons.AbstractFactory;

import java.util.ArrayList;

public class VehicleFactoryEssence implements IvehiculeFactory {


    @Override
    public Automobile getAutomobile(String id, String nom, ArrayList<String> options, ArrayList<String> animations, int prix, ArrayList<String> images) {
        return new AutomobileEssence(id, nom, options, animations, prix, images);
    }


    @Override
    public Scooter getScooter(String id, String nom, ArrayList<String> options, ArrayList<String> animations,
            int prix, ArrayList<String> images) {
        return new ScooterEssence(id, nom, nom, options, animations, prix,images);
    }



    
}
