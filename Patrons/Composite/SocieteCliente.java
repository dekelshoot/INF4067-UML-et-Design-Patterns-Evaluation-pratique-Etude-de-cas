package Patrons.Composite;

public class SocieteCliente extends Societe{

    public SocieteCliente(String nomSociete) {
        super(nomSociete);
    }

    @Override
    public void afficherSociete() {
       System.out.println("\t Societe:");
       System.out.println("\t nom: "+this.nomSociete);
    }
    
}
