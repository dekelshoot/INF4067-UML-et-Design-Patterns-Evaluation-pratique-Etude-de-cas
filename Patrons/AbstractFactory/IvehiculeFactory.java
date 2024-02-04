package Patrons.AbstractFactory;

import java.util.ArrayList;

public interface IvehiculeFactory {
    public Automobile getAutomobile(String id, String nom, ArrayList<String> options, ArrayList<String> animations, int prix, ArrayList<String> images);
    public Scooter getScooter(String id, String nom, ArrayList<String> options, ArrayList<String> animations, int prix, ArrayList<String> images);
}
