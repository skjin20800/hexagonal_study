package com.haivis.flow.recipe.domain;

import com.haivis.flow.common.AITask;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Value;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Recipe {


    @Getter private final RecipeId id;
    @Getter private final AITask task;


    /**
     * Creates an {@link Recipe} entity without an ID. Use to create a new entity that is not yet
     * persisted.
     */
    public static Recipe withoutId(AITask aiTask) {
        return new Recipe(null,aiTask);
    }


    /**
     * Creates an {@link Recipe} entity with an ID. Use to reconstitute a persisted entity.
     */
    public static Recipe withId(RecipeId accountId,AITask aiTask) {
        return new Recipe(accountId,aiTask);
    }

    @Value
    public static class RecipeId {
        private Long value;
    }



}
