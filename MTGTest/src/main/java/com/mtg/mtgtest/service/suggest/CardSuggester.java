package com.mtg.mtgtest.service.suggest;

import com.mtg.mtgtest.card.catalog.model.Card;

import java.util.Collection;

public interface CardSuggester {
  Collection<Card> suggestCardsByName(String name);
}
