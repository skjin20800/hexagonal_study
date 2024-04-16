package com.haivis.flow.recipe.adapter.out.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RecipeRepository extends JpaRepository<RecipeJpaEntity,Long> {
}
