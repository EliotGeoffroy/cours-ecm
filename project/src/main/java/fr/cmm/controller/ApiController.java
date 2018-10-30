package fr.cmm.controller;

import fr.cmm.domain.Recipe;
import fr.cmm.helper.PageQuery;
import fr.cmm.service.RecipeService;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.*;
import javax.inject.Inject;


@Controller
public class ApiController {
    @Inject
    private RecipeService recipeService;

    @RequestMapping(value = "/api/recipes", method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public Iterable<Recipe> listeRecettes(){
        PageQuery pageQuery = new PageQuery();
        return recipeService.findByQuery(pageQuery);
    }

    @RequestMapping(value = "/api/recipes/{id}", method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public Recipe recetteParId(@PathVariable("id") String id){
        if (recipeService.findById(id) == null)
            throw new ResourceNotFoundException();
        else
            return recipeService.findById(id);
    }

}
