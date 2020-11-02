package Arbres;

import java.util.Set;

public class Feuille implements Arbre {

    Integer numFeuille;


    public Feuille(Integer numFeuille) {
        this.numFeuille = numFeuille;
    }


    @Override
    public int taille() {
        return 1;
    }

    @Override
    public boolean contient(Integer val) {
        return this.numFeuille==val;
    }

    @Override
    public Set<Integer> valeurs() {
        return this.valeurs();
    }

    @Override
    public Integer somme() {
        return this.somme();
    }

    @Override
    public Integer min() {
        return this.min();
    }

    @Override
    public Integer max() {
        return this.max();
    }

    @Override
    public boolean estTrie() {
        return false;
    }
}
