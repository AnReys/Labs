package lab2;

import java.util.List;
import java.util.Objects;

public class University extends UniversityStructure{
    private List<Fculty>facuties;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        University that = (University) o;
        return Objects.equals(facuties, that.facuties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(facuties);
    }

    public List<Fculty> getFacuties() {
        return facuties;
    }

    public void setFacuties(List<Fculty> facuties) {
        this.facuties = facuties;
    }

    @Override
    public String toString() {
        return "University{" +
                "facuties=" + facuties +
                ", title='" + title + '\'' +
                ", manager=" + manager +
                '}';
    }
}
