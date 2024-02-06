package Patrons.DecorateurObserver;

import java.util.ArrayList;

import Patrons.AbstractFactory.Vehicule;

public abstract class AfficherVehicule {
    public ArrayList<ObserveurAffichage> observeurAffichage = new ArrayList<>();
    public ArrayList<Vehicule> vehicules = new ArrayList<>();
    
    
    public abstract void afficherVehicule();
    public abstract void detacher(ObserveurAffichage observer);
    public abstract void attacher(ObserveurAffichage observer);
    public abstract void notifier();
    public abstract void changerEtat();
}
