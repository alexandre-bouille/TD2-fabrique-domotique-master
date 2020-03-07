package fr.univamu.iut.exo2;

import fr.univamu.iut.exo1.Connectable;

public abstract class ConnectableFactory {

    public abstract Connectable creat(String s) throws ClassNotFoundException;

    public abstract void equiper (Connectable c);

    public Connectable fabriquer(String s) throws ClassNotFoundException {
        Connectable c = creat(s);
        equiper(c);
        return c;
    }
}