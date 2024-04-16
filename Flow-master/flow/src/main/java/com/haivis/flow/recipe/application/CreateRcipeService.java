package com.haivis.flow.recipe.application;

import com.haivis.flow.common.UseCase;
import com.haivis.flow.recipe.application.port.in.CreateRecipeCommand;
import com.haivis.flow.recipe.application.port.in.CreateRecipeUseCase;
import com.haivis.flow.recipe.application.port.out.LoadRecipePort;
import com.haivis.flow.recipe.domain.Recipe;
import lombok.RequiredArgsConstructor;

import javax.transaction.Transactional;

@RequiredArgsConstructor
@UseCase
@Transactional
public class CreateRcipeService implements CreateRecipeUseCase {

    private final LoadRecipePort loadRecipe;

    @Override
    public boolean createRecipe(CreateRecipeCommand command) {

        Recipe testRecipe = loadRecipe.loadRecipe(command.getFactoryId(),command.getInspectionTask());
        if(loadRecipe != null) return true;
        return false;
    }
}
