package Patrons.Adapter;
import java.io.IOException;
import java.io.PrintWriter;

public class Client {

public static void main(String[] args) {
        Document doc = new DocumentHtml("document 1","immatriculation","kjsdfjksfkjdsfkjdsfsjd dsfbdskf");
        doc.afficherDocument();
        doc.imprimerDocument();
    }
    
}
