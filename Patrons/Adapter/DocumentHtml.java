package Patrons.Adapter;

import java.io.IOException;
import java.io.PrintWriter;

public class DocumentHtml implements Document {
    public String nom;
    public String type;
    public String contenu;

    public DocumentHtml(String nom, String type , String contenu){
        this.type = type;
        this.contenu=contenu;
        this.nom = nom;    
    }

    @Override
    public String getContenu() {
        return this.contenu;
    }

    @Override
    public void setContenu(String contenu) {
        this.contenu = contenu;
    }

    @Override
    public void afficherDocument() {
        System.out.println("Afficharge du document...\n\t Type: "+this.type+"\n\t Nom: "+this.nom+"\n\t Contenu: "+this.contenu);
    }

    @Override
    public void imprimerDocument() {
               try {
            // Créer un objet PrintWriter pour écrire dans le fichier
            PrintWriter out = new PrintWriter("./assets/"+this.nom+".html");

            // Écrire du texte dans le fichier
            out.println(this.contenu);

            // Fermer le fichier
            out.close();

        } catch (IOException e) {
            e.printStackTrace();
        } 
    }
}
