package Generique;

import Arbres.Arbre;

import java.util.List;
import java.util.Set;

public class Noeud <T> implements ArbreGen <T> {


     private final List <ArbreGen <T> > ListeArbre ;


    public Noeud(List <ArbreGen <T> > listeArbre) {

        ListeArbre = listeArbre;
    }

    public List<ArbreGen <T> > getListeArbre() {
        return ListeArbre;
    }

    @Override
    public int taille(){
        int rtr=0;
        for (final ArbreGen <T>  a : ListeArbre){
            rtr+=a.taille();
        }
        return rtr;
    }

    @Override
    public boolean contient(final T val) {
        boolean rtr=false;

        for (final ArbreGen <T>  a : ListeArbre){
            if (a.contient(val))
                return  true;

        }
        return rtr;

    }

    @Override
    public Set<T> valeurs() {

        Set<T> rtr = null;

        for (final ArbreGen <T>  a  : ListeArbre){
            rtr.addAll(a.valeurs());
        }

        return rtr;
    }
}
