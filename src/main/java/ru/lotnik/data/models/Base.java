package ru.lotnik.data.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@MappedSuperclass
@Getter
@Setter
public abstract class Base {


    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="HibernateSeq")
    @SequenceGenerator(name ="HibernateSeq", sequenceName="hibernate_sequence", allocationSize=1, initialValue=1)
    @Column(name = "id", unique = true)
    private Long id;

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Base other = (Base) obj;
        if(id == null) {
            return false;
        } else if (!id.equals(other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
