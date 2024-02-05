package Patrons.FactoryMethod;

import java.util.ArrayList;

import Patrons.AbstractFactory.Vehicule;
import Patrons.Composite.Societe;

public class CommandePayeComptant extends Commande{

    public CommandePayeComptant(String idCommande,Societe societeCliente,ArrayList<Vehicule> vehicules) {
        super(idCommande,societeCliente,vehicules);
        this.type = "Comptant";
        this.idCommande = idCommande;

    }

}
