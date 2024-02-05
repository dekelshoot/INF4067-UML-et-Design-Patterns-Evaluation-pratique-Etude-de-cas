package Patrons.FactoryMethod;

import java.util.ArrayList;

import Patrons.AbstractFactory.Vehicule;

public class CommandePayeComptant extends Commande{

    public CommandePayeComptant(ArrayList<Vehicule> vehicules, String paysLivraison) {
        super(vehicules, paysLivraison);
        this.type = "Comptant";

    }

}
