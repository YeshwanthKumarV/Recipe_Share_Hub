package com.yeshh.service;
import java.util.List;

import com.yeshh.model.Recipe;
import com.yeshh.model.User;

public interface RecipeService
{
	public Recipe CreateRecipe(Recipe recipe,User user);
	public Recipe findRecipeById(Long id) throws Exception;
	public void deleteRecipe(Long id)throws Exception;
	public Recipe UpdateRecipe(Recipe recipe,Long Id)throws Exception;
	public List<Recipe>findAllRecipe();
	public Recipe LikeRecipe(Long recipeId,User user)throws Exception;

}
