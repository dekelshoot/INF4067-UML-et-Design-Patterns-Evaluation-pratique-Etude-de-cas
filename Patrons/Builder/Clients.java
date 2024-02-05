package Patrons.Builder;

import java.util.ArrayList;

import Patrons.AbstractFactory.Automobile;
import Patrons.AbstractFactory.IvehiculeFactory;
import Patrons.AbstractFactory.Scooter;
import Patrons.AbstractFactory.VehicleFactoryEssence;
import Patrons.AbstractFactory.Vehicule;
import Patrons.AbstractFactory.VehiculeFactoryElectrique;
import Patrons.Composite.GroupeSocieteCliente;
import Patrons.Composite.Societe;
import Patrons.Composite.SocieteCliente;
import Patrons.Singleton.LiassViergeDocuments;
import Patrons.FactoryMethod.*;

public class Clients {
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

 
        Societe societe1 = new SocieteCliente("CMC");
        Societe societe2 = new SocieteCliente("Sorepco");
        GroupeSocieteCliente societe3 = new GroupeSocieteCliente("Fokou");
        societe3.ajouterSociete(societe1);
        societe3.ajouterSociete(societe2);
        scooter = vehiculeFactory1.getScooter("001", "senke", options, animation, 1233, images);
        automobile = vehiculeFactory1.getAutomobile("002", "Carina", options, animation, 299040, images);
        
        ArrayList<Vehicule> vehicleList = new ArrayList<Vehicule>();
        vehicleList.add(scooter);
        vehicleList.add(automobile);
        FabriqueCommande fabriqueCommande = new FabriqueCommande();

        Commande commande = null;

                                                                                                                                                    
        commande = fabriqueCommande.fabriqueCommande("A20",societe3,vehicleList, 0);
        commande.ajouterCommand(scooter);
 
        Directeur directeur = new Directeur();
        ArrayList<LiassViergeDocuments> liassDocuments = directeur.construiLiasseDocuments(commande);
        for(int i=0; i<liassDocuments.size(); i++){
            liassDocuments.get(i).afficherLiassDocument();
        }
        

    }
    
}
