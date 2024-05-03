package com.example.finalproject.service;

import com.example.finalproject.model.PokemonCard;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
public class PokemonService {
    private final String uri = "https://api.pokemontcg.io/v2";
    private final String apiKey = "5697abc7-18ad-44fd-886d-f0456e00ea24";
    private HttpHeaders headers;
    private ObjectMapper mapper;

    // Constructor with dependency injection for the ObjectMapper
    @Autowired
    public PokemonService(ObjectMapper mapper) {
        this.mapper = mapper;
        this.headers = new HttpHeaders();
    }

    // Fetches a list of PokemonCard objects matching the provided name
    public List<PokemonCard> getPokemonCard(String name) throws IOException {
        List<PokemonCard> list = new ArrayList<>();
        String url = uri + "/cards?q=name:" + name;
        // Make API call and retrieve JSON response
        String pokeJson = callApi(url).getBody();
        // Parse JSON response and populate list
        pokemonResultsList(pokeJson, list);
        return list;
    }

    // Parses JSON response and creates a list of PokemonCard objects
    private void pokemonResultsList(String pokeJson, List<PokemonCard> list) throws IOException {
        JsonNode response = mapper.readTree(pokeJson);
        JsonNode pokemonCards = response.path("data");
        for (JsonNode node : pokemonCards) {
            PokemonCard card = createPokeCard(node);
            list.add(card);
        }
    }

    // Makes an API call to the specified URL and returns the response entity
    private ResponseEntity<String> callApi(String url) {
        // Set up the HTTP request entity with headers
        HttpEntity entity = new HttpEntity(headers);
        headers.set("X-Api-Key", apiKey);
        RestTemplate template = new RestTemplate();
        // Make the GET request and return the response
        return template.exchange(url, HttpMethod.GET, entity, String.class);
    }

    // Creates a PokemonCard object from a JSON node
    private PokemonCard createPokeCard(JsonNode node) {
        PokemonCard card = new PokemonCard();
        card.setId(node.path("id").asText());
        card.setName(node.path("name").asText());
        card.setHp(node.path("hp").asText());
        card.setSmall(node.path("images").path("small").asText());
        card.setPrice(node.path("cardmarket").path("prices").path("averageSellPrice").asText());
        return card;
    }
}
