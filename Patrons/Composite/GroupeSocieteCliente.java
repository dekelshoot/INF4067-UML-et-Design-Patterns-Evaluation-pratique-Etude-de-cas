package Patrons.Composite;

import java.util.ArrayList;



public class GroupeSocieteCliente extends Societe {
    ArrayList<Societe> societes = new ArrayList<Societe>();

    public GroupeSocieteCliente(String nomSociete) {
        super(nomSociete);
        societes.add(this);
    }

    @Override
    public void afficherSociete() {
       System.out.println("\t Societes:");
       System.out.println("\t\t nom:");
       for(Societe s: societes){
        System.out.println("\t\t "+s.nomSociete);
       }
    }

    public void ajouterSociete(Societe societe){
        this.societes.add(societe);
    }
    public void supprimerSociete(Societe societe){
        this.societes.remove(societe);
    }

    public Societe getSociete(int index){
        return this.societes.get(index);
    }

    public int gSocieteCount(){
        return this.societes.size();
    }
}
