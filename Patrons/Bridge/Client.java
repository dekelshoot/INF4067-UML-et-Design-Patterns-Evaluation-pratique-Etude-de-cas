package Patrons.Bridge;

public class Client {
    public static void main(String[] args) {
        Formulaire formulaire = new FormulaireHtml(new Input("email"));
        formulaire.ajouterWidget(new Texte("Hello"));
        formulaire.ajouterWidget(new TextArea("aujourd'hui nous somme "));
        formulaire.afficherFormulaire();
    }
    
}
