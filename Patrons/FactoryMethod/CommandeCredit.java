package Patrons.FactoryMethod;
import Patrons.Composite.Societe;
import java.util.ArrayList;

import Patrons.AbstractFactory.Vehicule;

public class CommandeCredit extends Commande{

    public CommandeCredit(String idCommande,Societe societeCliente,ArrayList<Vehicule> vehicules) {
        super(idCommande,societeCliente,vehicules);
        this.type = "Credit";
        this.idCommande = idCommande;

    }


    
}
