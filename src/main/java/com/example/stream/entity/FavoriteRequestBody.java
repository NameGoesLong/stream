package com.example.stream.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;


public class FavoriteRequestBody {
    private final Item favoriteItem;

    // Since there is only one property, we discard the builder structure
    // Use @JsonCreator to notify Jackson to use FavoriteRequestBody to construct the item
    @JsonCreator
    public FavoriteRequestBody(@JsonProperty("favorite") Item favoriteItem) {
        this.favoriteItem = favoriteItem;
    }

    public Item getFavoriteItem() {
        return favoriteItem;
    }
}
