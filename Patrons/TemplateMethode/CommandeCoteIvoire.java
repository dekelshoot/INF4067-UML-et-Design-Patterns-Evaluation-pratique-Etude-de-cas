package Patrons.TemplateMethode;
import java.util.ArrayList;

import Patrons.AbstractFactory.Vehicule;


public class CommandeCoteIvoire extends Commande{

    public CommandeCoteIvoire(ArrayList<Vehicule> vehicules, String paysLivraison) {
        super(vehicules, paysLivraison);
        this.montantTva= (this.montantHt*20)/100;
        this.calculerMontantTtc();
    }

    
}
