package Generique2;

import java.util.Objects;

public class Chaine implements Sommable<Chaine> {

    String value;

    public Chaine(String value) {
        this.value = value;
    }

    @Override
    public Chaine ajouter(Chaine other) {

        return new Chaine(this.value + other.value);
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
    public int hashCode() {
        return Objects.hash(value);
    }
}