package fr.cmm.controller;

import fr.cmm.service.RecipeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.inject.Inject;

@Controller
public class ApiController {
    @Inject
    private RecipeService recipeService;

    @RequestMapping("/api/recipes")
    public String liste(){
        return "Liste";
    }

    @RequestMapping("/api/recipes/{id}")
    public String recette(){
        return "Recette";
    }

}
