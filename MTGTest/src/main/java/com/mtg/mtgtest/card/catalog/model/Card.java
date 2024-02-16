package com.mtg.mtgtest.card.catalog.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value.Immutable;

import java.util.Set;

@Immutable
@JsonDeserialize(as = ImmutableCard.class)
public interface  Card {

    String name();
    Set<Color> colorIdentity();
    int convertedManaCost();
}
