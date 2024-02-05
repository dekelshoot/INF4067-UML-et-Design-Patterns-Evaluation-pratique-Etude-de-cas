package Patrons.Iterator;
import java.util.ArrayList;

import Patrons.AbstractFactory.*;
public class Client {
    public static void main(String[] args) {
        CatalogueVehicule catalogue = new CatalogueVehicule();
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
        automobile = vehiculeFactory1.getAutomobile("002", "Carina", options, animation, 1233, images);
        scooter = vehiculeFactory1.getScooter("001", "Senke", options, animation, 2333, images);

        catalogue.ajouterVehicule(scooter);
        catalogue.ajouterVehicule(automobile);

        IterateurVehicule iterator = catalogue.creerIterateur();
        int i = 0;
        while (iterator.suivantDisponible()) {
            Vehicule vehicule = iterator.suivante();
            System.out.println(i++);
            vehicule.afficherVehicule();
        }
    }
}