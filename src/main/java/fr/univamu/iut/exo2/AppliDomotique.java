package fr.univamu.iut.exo2;

import fr.univamu.iut.exo1.Connectable;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class AppliDomotique {
    static ArrayList<Connectable> objets = new ArrayList<Connectable>();
    static ConnectableFactory factory = new Factory();

    public static String menu() {
        String choix = "radiateur";
        System.out.println("Taper 0 pour finir, 1 pour connecter une cafetière et 2 pour une radio");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            choix = in.readLine();
        } catch (IOException e) {
            System.out.println("Problème de saisie");
        }
        return choix;
    }

    public static void connecter(String s)  {
        try {
            fr.univamu.iut.exo2.AppliDomotique.objets.add(ConnectableFactory.fabriquer(s));
        }
        catch (ClassNotFoundException c) {

        }
    }

    public static void main(String[] args) {
        String type = "";
        while ((type = menu()) != "") {
            connecter(type);
        }
        System.out.println(objets);
    }
}
