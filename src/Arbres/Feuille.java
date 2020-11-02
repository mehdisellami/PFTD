package Arbres;

import java.util.Set;

public class Feuille implements Arbre {

    Integer numFeuille;


    public Feuille(Integer numFeuille) {
        this.numFeuille = numFeuille;
    }


    @Override
    public int taille() {
        return 0;
    }

    @Override
    public boolean contient(Integer val) {
        return false;
    }

    @Override
    public Set<Integer> valeurs() {
        return null;
    }

    @Override
    public Integer somme() {
        return null;
    }

    @Override
    public Integer min() {
        return null;
    }

    @Override
    public Integer max() {
        return null;
    }

    @Override
    public boolean estTrie() {
        return false;
    }
}
