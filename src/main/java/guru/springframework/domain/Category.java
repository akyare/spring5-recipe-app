package guru.springframework.domain;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

//@Data does not work because of the @EqualsAndHashCode
@Data
@EqualsAndHashCode(exclude = {"recipes"})
@Entity
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;

    @ManyToMany(mappedBy = "categories")
    private Set<Recipe> recipes;

}
