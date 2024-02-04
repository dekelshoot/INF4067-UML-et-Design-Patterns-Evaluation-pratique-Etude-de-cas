package Patrons.AbstractFactory;

import java.util.ArrayList;

public class client {
    public static void main(String[] args) {
        IvehiculeFactory vehiculeFactory1 = new VehicleFactoryEssence();
        IvehiculeFactory vehiculeFactory2 = new VehiculeFactoryElectrique();
        Automobile automobile = null;
        Scooter scooter = null;

        ArrayList options= new ArrayList<String>();
        options.add("carina");
        ArrayList animation= new ArrayList<String>();
        animation.add("animation 1");
        ArrayList images= new ArrayList<String>();
        images.add("http://localhost");

        System.out.println("utilisation de la premiere fabrique");
       
        scooter = vehiculeFactory1.getScooter("001", "Carina", options, animation, 1233, images);
        scooter.afficherVehicule();
    }
}
