package Patrons.DecorateurObserver;

import java.util.ArrayList;
import java.util.List;

import Patrons.AbstractFactory.Vehicule;

public class ComposantAfficheVehicule extends AfficherVehicule {
    public ComposantAfficheVehicule(ArrayList<Vehicule> vehicules){
        this.vehicules = vehicules;
    }

    @Override
    public void afficherVehicule() {
        for(Vehicule v: vehicules){
            v.afficherVehicule();
        }
    }

    @Override
    public void attacher(ObserveurAffichage observer) {
        observeurAffichage.add(observer);
    }

    @Override
    public void detacher(ObserveurAffichage observer) {
        observeurAffichage.remove(observer);
    }

    @Override
    public void notifier() {
        for (ObserveurAffichage observateur : observeurAffichage) {
            observateur.mettreAjour();
        }
    }

    public void changerEtat() {
        notifier();
    }

}
