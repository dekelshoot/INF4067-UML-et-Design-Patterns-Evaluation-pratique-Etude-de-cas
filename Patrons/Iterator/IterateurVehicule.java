package Patrons.Iterator;

import Patrons.AbstractFactory.Vehicule;

public  interface IterateurVehicule {
    
    public Vehicule suivante();
    public Boolean suivantDisponible();
}  
    
