package com.example.finalproject.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.text.DecimalFormat;

/**
 * The PokemonCard class represents a model for a Pokémon card, containing information
 * such as id, name, hp (health points), image (small), and price.
 *
 * The class uses the @JsonIgnoreProperties annotation to ignore any unknown JSON properties
 * during deserialization, ensuring only the relevant fields are processed.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class PokemonCard {
    // Attributes of the PokemonCard class
    private String id;        // Unique identifier for the Pokémon card
    private String name;      // Name of the Pokémon card
    private String hp;        // Health points of the Pokémon card
    private String small;     // URL to a small image of the Pokémon card
    private String price;     // Price of the Pokémon card

    // Getters and setters for the class attributes

    /**
     * Gets the unique identifier of the Pokémon card.
     *
     * @return The id of the Pokémon card.
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the unique identifier of the Pokémon card.
     *
     * @param id The new id to be set for the Pokémon card.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Gets the name of the Pokémon card.
     *
     * @return The name of the Pokémon card.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the Pokémon card.
     *
     * @param name The new name to be set for the Pokémon card.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the health points of the Pokémon card.
     *
     * @return The health points (hp) of the Pokémon card.
     */
    public String getHp() {
        return hp;
    }

    /**
     * Sets the health points of the Pokémon card.
     *
     * @param hp The new health points (hp) to be set for the Pokémon card.
     */
    public void setHp(String hp) {
        this.hp = hp;
    }

    /**
     * Gets the URL to a small image of the Pokémon card.
     *
     * @return The URL to the small image of the Pokémon card.
     */
    public String getSmall() {
        return small;
    }

    /**
     * Sets the URL to a small image of the Pokémon card.
     *
     * @param small The new URL to be set for the small image of the Pokémon card.
     */
    public void setSmall(String small) {
        this.small = small;
    }

    /**
     * Gets the price of the Pokémon card. Uses the formatPrice method to format
     * the price before returning it.
     *
     * @return The formatted price of the Pokémon card.
     */
    public String getPrice() {
        return formatPrice(price);
    }

    /**
     * Sets the price of the Pokémon card.
     *
     * @param price The new price to be set for the Pokémon card.
     */
    public void setPrice(String price) {
        this.price = price;
    }

    /**
     * Formats the provided price to two decimal places using String.format.
     *
     * @param price The raw price as a string.
     * @return The formatted price string with two decimal places.
     */
    private String formatPrice(String price) {
        if (price == null || price.isEmpty()) {
            // Return an empty string if the price is null or empty
            return "";
        }
        try {
            // Parse the price as a double
            double parsedPrice = Double.parseDouble(price);
            // Format the price to two decimal places using String.format
            return String.format("%.2f", parsedPrice);
        } catch (NumberFormatException e) {
            // If parsing fails, return the original price
            // (you could handle error cases differently as needed)
            return price;
        }
    }
}
