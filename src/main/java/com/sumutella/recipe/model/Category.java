package com.sumutella.recipe.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.ArrayList;
import java.util.List;

/**
 * @author sumutella
 * @time 10:57 PM
 * @since 12/23/2019, Mon
 */
@Entity
@Data
@EqualsAndHashCode(exclude = {"recipes"})
public class Category extends BaseEntity {
    private String description;

    @ManyToMany(mappedBy = "categories")
    private List<Recipe> recipes = new ArrayList<>();

}
