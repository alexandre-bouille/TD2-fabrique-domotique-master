package fr.univamu.iut.exo2;

import fr.univamu.iut.exo1.Cafetiere;
import fr.univamu.iut.exo1.Connectable;
import fr.univamu.iut.exo1.Radio;

public class Factory extends ConnectableFactory {

    public void equiper (Connectable c) {
        c.equiper("LA POMME");
    }

    public Connectable creat(String s) throws ClassNotFoundException {
        if (s == "cafetiere") {
            return new Cafetiere();
        }
        else if (s == "radio") {
            return new Radio();
        }
        else if (s == "radiateur") {
            return new Radiateur();
        }
        else throw new ClassNotFoundException();
    }
}
