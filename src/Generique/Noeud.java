package Generique;

import Arbres.Arbre;

import java.util.List;
import java.util.Set;

public class Noeud <T> implements ArbreGen <T> {


     private final List <T> ListeArbre ;


    public Noeud(List <T> listeArbre) {

        ListeArbre = listeArbre;
    }

    public List<T> getListeArbre() {
        return ListeArbre;
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
