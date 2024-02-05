package Patrons.Bridge;

import java.util.ArrayList;

public abstract class Formulaire {
    public ArrayList<Widget> widgets;

    public Formulaire(Widget widget) {
        this.widgets.add(widget);
    }
    public Formulaire(ArrayList<Widget>  widget) {
        this.widgets = widget;
    }

    public abstract void ajouterWidget(Widget widget);
    public abstract void supprimerWidget(Widget widget);
}
