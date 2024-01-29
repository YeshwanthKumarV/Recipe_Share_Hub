package com.yeshh.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yeshh.model.Recipe;

public interface RecipeRepository extends JpaRepository<Recipe,Long> {

}
