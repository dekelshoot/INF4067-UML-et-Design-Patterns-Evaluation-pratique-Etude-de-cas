package Patrons.FactoryMethod;

import java.util.ArrayList;

import Patrons.AbstractFactory.Vehicule;
import Patrons.Composite.Societe;

public class FabriqueCommande {

    public Commande fabriqueCommande(String idCommande,Societe societeCliente,ArrayList<Vehicule> vehicules,int type){
        if(type!=1){
            return new CommandeCredit(idCommande,societeCliente,vehicules);
        }
        return new CommandePayeComptant(idCommande,societeCliente,vehicules);
    }
}
