package Generique;

import Arbres.Arbre;

import java.util.Set;

public class Feuille <T> implements ArbreGen <T> {

    T numFeuille;


    public Feuille(T numFeuille) {
        this.numFeuille = numFeuille;
    }

    public T getNumFeuille() {
        return numFeuille;
    }


    @Override
    public int taille() {
        return 1;
    }

    @Override
    public boolean contient(T val) {
        return this.numFeuille==val;
    }

    @Override
    public Set<T> valeurs() {
        return this.valeurs();
    }


}


