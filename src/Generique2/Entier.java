package Generique2;

import java.util.Objects;

public class Entier  implements Sommable<Entier> {

    int value;

    public Entier(int value) {
        this.value = value;
    }

    @Override
    public int compareTo(Chaine o) {
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Chaine chaine = (Chaine) o;
        return Objects.equals(value, chaine.value);
    }

    @Override
    public Entier ajouter(Entier other) {
        return new Entier(this.value + other.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}


