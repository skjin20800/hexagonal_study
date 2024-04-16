package com.haivis.flow.recipe.adapter.out.persistence;


import com.haivis.flow.common.AITask;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "recipe")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RecipeJpaEntity {

    @Id
    @GeneratedValue
    private Long id;

    @NotNull
    private AITask aiTask;
}
