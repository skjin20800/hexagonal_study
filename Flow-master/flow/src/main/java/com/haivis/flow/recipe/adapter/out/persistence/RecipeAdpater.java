package com.haivis.flow.recipe.adapter.out.persistence;

import com.haivis.flow.common.AITask;
import com.haivis.flow.common.PersistenceAdapter;
import com.haivis.flow.recipe.application.port.out.LoadRecipePort;
import com.haivis.flow.recipe.domain.Recipe;
import com.haivis.flow.recipe.domain.Recipe.RecipeId;
import lombok.RequiredArgsConstructor;

import javax.persistence.EntityNotFoundException;

@RequiredArgsConstructor
@PersistenceAdapter
public class RecipeAdpater implements LoadRecipePort {

    private final RecipeRepository recipeRepository;
    private final RecipeMapper recipeMapper;

    @Override
    public Recipe loadRecipe(RecipeId recipeId, AITask aiTask) {

        RecipeJpaEntity recipe = recipeRepository.findById(recipeId.getValue())
                .orElseThrow(EntityNotFoundException::new);

        return recipeMapper.mapToDomainEntity(recipe);
    }
}
