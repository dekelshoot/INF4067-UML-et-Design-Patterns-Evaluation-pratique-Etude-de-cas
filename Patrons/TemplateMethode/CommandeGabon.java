package Patrons.TemplateMethode;
import java.util.ArrayList;

import Patrons.AbstractFactory.Vehicule;


public class CommandeGabon extends Commande{

    public CommandeGabon(ArrayList<Vehicule> vehicules, String paysLivraison) {
        super(vehicules, paysLivraison);
        this.montantTva= (this.montantHt*18)/100;
        this.calculerMontantTtc();
    }

    
}
