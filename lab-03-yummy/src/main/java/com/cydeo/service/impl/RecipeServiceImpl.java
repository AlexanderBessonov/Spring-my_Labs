package com.cydeo.service.impl;

import com.cydeo.repository.RecipeRepository;
import com.cydeo.service.RecipeService;
import com.cydeo.service.ShareService;
import com.github.javafaker.Faker;

public class RecipeServiceImpl implements RecipeService {

   private final RecipeRepository recipeRepository;
   private final ShareService shareService;

   private final Faker faker;


    public RecipeServiceImpl(RecipeRepository recipeRepository, ShareService shareService, Faker faker) {
        this.recipeRepository = recipeRepository;
        this.shareService = shareService;
        this.faker = faker;
    }
}
