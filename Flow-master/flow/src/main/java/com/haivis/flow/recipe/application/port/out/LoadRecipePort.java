package com.haivis.flow.recipe.application.port.out;

import com.haivis.flow.common.AITask;
import com.haivis.flow.recipe.domain.Recipe;
import com.haivis.flow.recipe.domain.Recipe.RecipeId;

public interface LoadRecipePort {

    Recipe loadRecipe(RecipeId recipeId, AITask aiTask);
}
