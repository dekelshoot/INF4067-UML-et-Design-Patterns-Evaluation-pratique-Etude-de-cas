package Patrons.Iterator;
import java.util.ArrayList;
import Patrons.AbstractFactory.*;

public abstract class Catalogue {
    public  ArrayList<Vehicule> vehicules= new ArrayList<Vehicule>();

    public abstract  IterateurVehicule creerIterateur();
}
