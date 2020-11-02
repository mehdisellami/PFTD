package Generique2;


import java.util.Set;

public interface ArbreGen <T extends Sommable<T>  & Comparable<T> > {

    int taille();

    boolean contient(final T val);
    Set<T> valeurs();

    T somme();

    T min();
    T max();

    boolean estTrie();




}
