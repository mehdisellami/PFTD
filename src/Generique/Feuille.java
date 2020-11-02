package Generique;

import Arbres.Arbre;

import java.util.Set;

public class Feuille <T> implements ArbreGen <T> {

    Integer numFeuille;


    public Feuille(Integer numFeuille) {
        this.numFeuille = numFeuille;
    }

    public Integer getNumFeuille() {
        return numFeuille;
    }

    @Override
    public T taille() {
        return null;
    }

    @Override
    public T contient(T val) {
        return null;
    }

    @Override
    public Set<T> valeurs() {
        return null;
    }
}
