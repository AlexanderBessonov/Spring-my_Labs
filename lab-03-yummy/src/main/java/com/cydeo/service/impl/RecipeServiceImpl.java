package com.cydeo.service.impl;

import com.cydeo.model.Ingredient;
import com.cydeo.model.Recipe;
import com.cydeo.repository.RecipeRepository;
import com.cydeo.service.RecipeService;
import com.cydeo.service.ShareService;
import com.github.javafaker.Faker;

import java.util.List;
import java.util.Random;
import java.util.UUID;

public class RecipeServiceImpl implements RecipeService {

   private final RecipeRepository recipeRepository;
   private final ShareService shareService;

   private final Faker faker;


    public RecipeServiceImpl(RecipeRepository recipeRepository, ShareService shareService, Faker faker) {
        this.recipeRepository = recipeRepository;
        this.shareService = shareService;
        this.faker = faker;
    }

    public boolean prepareRecipe(){

        Recipe recipe = new Recipe();
        recipe.setRecipeId(UUID.randomUUID());
        recipe.setName(faker.food().dish());
        recipe.setDuration(generateRandomValue());
        recipe.setPreparation(faker.lorem().paragraph(generateRandomValue()));
        recipe.setIngredients(prepareIngredient());

        return false;
    }

    private List<Ingredient> prepareIngredient() {
        Ingredient ingredient = new Ingredient();
        ingredient.setName(faker.food().ingredient());
        ingredient.setQuantity(generateRandomValue());
        ingredient.getQuantityType();
    }

    private int generateRandomValue(){
        return new Random().nextInt(20);
    }

}
