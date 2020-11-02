package Generique;

import java.util.Set;

public interface ArbreGen <T> {

    T taille();
    T contient(final T val);
    Set<T> valeurs();

}
