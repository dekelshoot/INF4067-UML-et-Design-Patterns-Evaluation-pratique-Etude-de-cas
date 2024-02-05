package Patrons.TemplateMethode;
import java.util.ArrayList;

import Patrons.AbstractFactory.Vehicule;


public class CommandeCameroun extends Commande{

    public CommandeCameroun(ArrayList<Vehicule> vehicules, String paysLivraison) {
        super(vehicules, paysLivraison);
        this.montantTva= (this.montantHt*19)/100;
        this.calculerMontantTtc();
    }

    
}
