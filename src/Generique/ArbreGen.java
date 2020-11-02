package Generique;


import java.util.Set;

public interface ArbreGen <T > {

    int taille();

    boolean contient(final T val);
    Set<T> valeurs();
}
