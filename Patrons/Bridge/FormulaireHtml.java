package Patrons.Bridge;

import java.util.ArrayList;

public class FormulaireHtml extends Formulaire{
    public  FormulaireHtml(ArrayList<Widget> widget) {
        super(widget);
    }

    public  FormulaireHtml(Widget widget) {
        super(widget);
    }

    public void supprimerWidget(Widget widget) {
        this.widgets.remove(widget);
    }

    public void ajouterWidget(Widget widget) {
        this.widgets.add(widget);
    }

    @Override
    public void afficherFormulaire() {
        System.out.println("\t Formulaire: ");
        System.out.println("\t\t Type: \t Contenu");
        for(Widget w : widgets) {
            System.out.println("\t\t " + w.type+ "\t "+w.contenu);
         }
    }
}
