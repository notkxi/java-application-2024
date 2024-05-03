package com.example.finalproject.controller;

import com.example.finalproject.model.PokemonCard;
import com.example.finalproject.service.PokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@Controller
public class PokemonController {

    // Dependency injection of PokemonService
    private final PokemonService pokeService;

    // Constructor injecting PokemonService dependency
    @Autowired
    public PokemonController(PokemonService pokeService) {
        this.pokeService = pokeService;
    }

    /**
     * Handles GET requests to the specified URL pattern ("/{name}").
     *
     * @param name  The name of the Pokémon card to search for, extracted from the URL path.
     * @param model The model to add attributes to be rendered in the view.
     * @return      The name of the view to render (e.g. "pokemon" or "error").
     */
    @GetMapping("/{name}")
    public String getPokemon(@PathVariable("name") String name, Model model) {
        try {
            // Fetch Pokémon cards matching the provided name using the PokemonService
            List<PokemonCard> cards = pokeService.getPokemonCard(name);
            // Add the list of Pokémon cards to the model
            model.addAttribute("cards", cards);
            // Return the view name "pokemon" for rendering the result
            return "pokemon";
        } catch (IOException ioe) {
            // Handle exceptions that may occur during fetching of data
            model.addAttribute("errorMessage", ioe.getMessage());
            // Return the view name "error" for rendering the error message
            return "error";
        }
    }
}
