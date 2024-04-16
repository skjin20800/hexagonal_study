package com.haivis.flow.recipe.application.port.in;

public interface CreateRecipeUseCase {
    boolean createRecipe(CreateRecipeCommand command);
}
