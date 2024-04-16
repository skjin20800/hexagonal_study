package com.haivis.flow.recipe.adapter.out.persistence;

import com.haivis.flow.recipe.domain.Recipe;
import com.haivis.flow.recipe.domain.Recipe.RecipeId;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class RecipeMapper {
    Recipe mapToDomainEntity(
            RecipeJpaEntity recipe) {
        return Recipe.withId(
                new RecipeId(recipe.getId()), recipe.getAiTask());
    }
}
