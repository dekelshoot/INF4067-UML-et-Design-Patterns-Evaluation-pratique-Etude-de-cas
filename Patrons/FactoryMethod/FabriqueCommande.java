package Patrons.FactoryMethod;

import java.util.ArrayList;

import Patrons.AbstractFactory.Vehicule;

public class FabriqueCommande {

    public Commande fabriqueCommande(ArrayList<Vehicule> vehicules, String paysLivraison,int type){
        if(type!=1){
            return new commandeCredit(vehicules, paysLivraison);
        }
        return new CommandePayeComptant(vehicules,paysLivraison);
    }
}
