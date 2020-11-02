package Arbres;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Noeud implements Arbre {


     private final List <Arbre> ListeArbre ;


    public Noeud(List <Arbre> listeArbre) {

        ListeArbre = listeArbre;
    }



    @Override
    public int taille(){
        int rtr=0;
        for (final Arbre a : ListeArbre){
            rtr+=a.taille();
        }
        return rtr;
    }

    @Override
    public boolean contient(final Integer val) {
        boolean rtr=false;

        for (final Arbre a : ListeArbre){
            if (a.contient(val))
                return  true;

        }
        return rtr;

    }

    @Override
    public Set<Integer> valeurs() {

        Set<Integer> rtr = null;

        for (final Arbre a  : ListeArbre){
        rtr.addAll(a.valeurs());
        }

     return rtr;
    }

    @Override
    public Integer somme() {
        int sum =0;

        for (final Arbre a : ListeArbre){
            sum =sum + a.somme();
        }


        return null;
    }

    @Override
    public Integer min() {
        if (ListeArbre == null || ListeArbre.size() == 0)
            return null;
        int rtr = ListeArbre.get(0).min();
        for (int i = 1; i < ListeArbre.size(); i++) {
            int min = ListeArbre.get(i).min();
            if (min < rtr) {
                rtr = min;
            }
        }
        return rtr;
    }

    @Override
    public Integer max() {
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
        return conditionTrie1() && conditionTrie2();
    }

    private boolean conditionTrie1() {
        boolean rtr = true;
        for (int i = 0; i < ListeArbre.size() - 1; i++) {
            final Arbre fi = ListeArbre.get(i);
            if (!fi.estTrie())
                return false;
        }
        return rtr;
    }

    private boolean conditionTrie2() {
        boolean rtr = true;
        for (int i = 0; i < ListeArbre.size() - 1; i++) {
            final Arbre fi = ListeArbre.get(i);
            final Arbre fj = ListeArbre.get(i+1);
            if (fi.max() > fj.min())
                return false;
        }
        return rtr;
    }
}
