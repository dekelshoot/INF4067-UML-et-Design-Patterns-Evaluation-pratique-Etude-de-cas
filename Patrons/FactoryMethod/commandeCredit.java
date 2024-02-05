package Patrons.FactoryMethod;

import java.util.ArrayList;

import Patrons.AbstractFactory.Vehicule;

public class commandeCredit extends Commande{

    public commandeCredit(ArrayList<Vehicule> vehicules, String paysLivraison) {
        super(vehicules, paysLivraison);
        this.type = "Credit";

    }


    
}
