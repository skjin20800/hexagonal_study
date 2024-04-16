package com.haivis.flow.recipe.application.port.in;

import com.haivis.flow.common.AITask;
import com.haivis.flow.common.SelfValidating;
import com.haivis.flow.recipe.domain.Recipe;
import com.haivis.flow.recipe.domain.Recipe.RecipeId;
import lombok.EqualsAndHashCode;
import lombok.Value;
import org.springframework.scheduling.config.Task;

import javax.validation.constraints.NotNull;

@Value
@EqualsAndHashCode(callSuper = false)
public class CreateRecipeCommand extends SelfValidating<CreateRecipeCommand> {

    @NotNull
    private final RecipeId factoryId;

    @NotNull
    private final AITask inspectionTask;

    public CreateRecipeCommand(RecipeId factoryId, String aiTask){
        this.factoryId = factoryId;
        this.inspectionTask = AITask.valueOf(aiTask);
        this.validateSelf();
    }


}
