package Patrons.Composite;

public class Client {
    public static void main(String[] args) {
        Societe societe1 = new SocieteCliente("CMC");
        Societe societe2 = new SocieteCliente("Sorepco");
        GroupeSocieteCliente societe3 = new GroupeSocieteCliente("Fokou");
        societe3.ajouterSociete(societe1);
        societe3.ajouterSociete(societe2);
        societe3.afficherSociete();
    }
    
}
