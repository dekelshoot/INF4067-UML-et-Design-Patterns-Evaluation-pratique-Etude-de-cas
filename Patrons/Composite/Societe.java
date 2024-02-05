package Patrons.Composite;

public abstract class Societe {
    public String nomSociete;
    public Societe(String nomSociete) {
        this.nomSociete=nomSociete;
    }
    public abstract void afficherSociete();

    
}
