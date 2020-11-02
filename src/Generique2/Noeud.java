package Generique2;

import java.util.List;
import java.util.Set;

public class Noeud <T extends Sommable<T> & Comparable<T>> implements ArbreGen<T> {


    private final List<ArbreGen<T>> ListeArbre;


    public Noeud(List<ArbreGen<T>> listeArbre) {

        ListeArbre = listeArbre;
    }


    public List<ArbreGen<T>> getListeArbre() {
        return ListeArbre;
    }

    @Override
    public int taille() {
        int rtr = 0;
        for (final ArbreGen<T> a : ListeArbre) {
            rtr += a.taille();
        }
        return rtr;
    }

    @Override
    public boolean contient(final T val) {
        boolean rtr = false;

        for (final ArbreGen<T> a : ListeArbre) {
            if (a.contient(val))
                return true;

        }
        return rtr;

    }

    @Override
    public Set<T> valeurs() {

        Set<T> rtr = null;

        for (final ArbreGen<T> a : ListeArbre) {
            rtr.addAll(a.valeurs());

        }

        return rtr;
    }

    @Override
    public T somme() {
        if (ListeArbre == null || ListeArbre.size() == 0)
            return null; // should it be 0 ? no because nothing to sum
        // alternative without 0 initialization
        // int rtr = fils.get(0).somme();
        // for (int i = 1; i<fils.size(); i++) {
        //     rtr += fils.get(i).somme();
        // }
        T rtr = ListeArbre.get(0).somme();
        for (int i = 1; i < ListeArbre.size(); i++) {
            rtr = rtr.ajouter(ListeArbre.get(0).somme());
        }
        return rtr;
    }

    @Override
    public T min() {
        if (ListeArbre == null || ListeArbre.size() == 0)
            return null;
        T rtr = ListeArbre.get(0).min();
        for (int i = 1; i < ListeArbre.size(); i++) {
            T min = ListeArbre.get(i).min();

        int x=    min.compareTo(rtr);


        }
        return rtr;
    }

    @Override
    public T max() {
        if (ListeArbre == null || ListeArbre.size() == 0)
            return null;
        int rtr = ListeArbre.get(0).max();
        for (int i = 1; i < ListeArbre.size(); i++) {
            int max = ListeArbre.get(i).max();
            if (max > rtr) {
                rtr = max;
            }
        }
        return rtr;
    }

    @Override
    public boolean estTrie() {
        return false;
    }
}