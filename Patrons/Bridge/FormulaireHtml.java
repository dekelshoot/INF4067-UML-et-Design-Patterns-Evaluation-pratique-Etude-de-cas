package Patrons.Bridge;

import java.util.ArrayList;

public class FormulaireHtml extends Formulaire{
    public FormulaireHtml(ArrayList<Widget> widget) {
        super(widget);
    }

    public void supprimerWidget(Widget widget) {
        this.widgets.remove(widget);
    }

    @Override
    public void ajouterWidget(Widget widget) {
        this.widgets.add(widget);
    }
}
