package lab2.model;

import java.util.List;
import java.util.Objects;

public class Fculty extends UniversityStructure{
    private List<Chair> chairs;

    public List<Chair> getChairs() {
        return chairs;
    }

    public void setChairs(List<Chair> chairs) {
        this.chairs = chairs;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fculty fculty = (Fculty) o;
        return Objects.equals(chairs, fculty.chairs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(chairs);
    }

    @Override
    public String toString() {
        return "Fculty{" +
                "chairs=" + chairs +
                ", title='" + title + '\'' +
                ", manager=" + manager +
                '}';
    }
}