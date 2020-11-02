package Generique2;

import java.util.Set;

public class Feuille <T extends Sommable<T>  & Comparable<T>> implements ArbreGen<T> {

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

    @Override
    public T somme() {
        return null;
    }

    @Override
    public T min() {
        return this.min();
    }

    @Override
    public T max() {
        return this.max();
    }

    @Override
    public boolean estTrie() {
        return false;
    }


}


