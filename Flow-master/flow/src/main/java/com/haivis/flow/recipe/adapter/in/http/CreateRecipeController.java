package com.haivis.flow.recipe.adapter.in.http;

import com.haivis.flow.common.AITask;
import com.haivis.flow.common.WebAdapter;
import com.haivis.flow.recipe.application.port.in.CreateRecipeCommand;
import com.haivis.flow.recipe.application.port.in.CreateRecipeUseCase;
import com.haivis.flow.recipe.domain.Recipe.RecipeId;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@WebAdapter
@RestController
@RequiredArgsConstructor
public class CreateRecipeController {

    private final CreateRecipeUseCase createRecipeUseCase;

    @PostMapping(path = "/accounts/send/{sourceAccountId}/{aiTask}")
    void sendMoney(
            @PathVariable("sourceAccountId") Long sourceAccountId,
            @PathVariable("aiTask") String aiTask) {

        CreateRecipeCommand command = new CreateRecipeCommand(
                new RecipeId(sourceAccountId),
                aiTask);

        createRecipeUseCase.createRecipe(command);

    }

}
