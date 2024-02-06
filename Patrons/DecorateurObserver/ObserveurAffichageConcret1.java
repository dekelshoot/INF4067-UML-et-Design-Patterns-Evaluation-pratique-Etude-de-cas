package Patrons.DecorateurObserver;

public class ObserveurAffichageConcret1 extends ObserveurAffichage {

    @Override
    public void mettreAjour() {
        System.out.println("L'état du catalogue a changé !");
    }
    
}
