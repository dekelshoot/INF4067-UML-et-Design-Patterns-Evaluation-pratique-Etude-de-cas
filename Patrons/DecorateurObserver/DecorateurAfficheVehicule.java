package Patrons.DecorateurObserver;

import java.util.ArrayList;

import Patrons.AbstractFactory.Vehicule;

public class DecorateurAfficheVehicule extends AfficherVehicule {
    AfficherVehicule afficherVehicule;
    public DecorateurAfficheVehicule(AfficherVehicule afficherVehicule){
        this.afficherVehicule = afficherVehicule;
    }

    @Override
    public void afficherVehicule() {
        afficherVehicule.afficherVehicule();
    }

    @Override
    public void attacher(ObserveurAffichage observer) {
        afficherVehicule.attacher(observer);
    }

    @Override
    public void detacher(ObserveurAffichage observer) {
        afficherVehicule.detacher(observer);
    }

    @Override
    public void notifier() {
        afficherVehicule.notifier();
    }

    public void changerEtat() {
        afficherVehicule.changerEtat();
    }
}
