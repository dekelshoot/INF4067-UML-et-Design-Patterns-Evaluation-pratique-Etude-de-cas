package Patrons.FactoryMethod;

import java.util.ArrayList;

import Patrons.AbstractFactory.Automobile;
import Patrons.AbstractFactory.IvehiculeFactory;
import Patrons.AbstractFactory.Scooter;
import Patrons.AbstractFactory.VehicleFactoryEssence;
import Patrons.AbstractFactory.Vehicule;
import Patrons.AbstractFactory.VehiculeFactoryElectrique;

public class Client {
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
       
        scooter = vehiculeFactory1.getScooter("001", "senke", options, animation, 1233, images);
        automobile = vehiculeFactory1.getAutomobile("002", "Carina", options, animation, 299040, images);
        
        ArrayList<Vehicule> vehicleList = new ArrayList<Vehicule>();
        vehicleList.add(scooter);
        vehicleList.add(automobile);
        FabriqueCommande fabriqueCommande = new FabriqueCommande();

        Commande commande = null;

        commande = fabriqueCommande.fabriqueCommande(vehicleList, "Cameroun", 0);
        commande.afficherFacture();
        commande.ajouterCommand(scooter);
        commande.afficherFacture();
    }
}
