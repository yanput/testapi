package com.mtg.mtgtest.card.catalog;
import com.mtg.mtgtest.card.catalog.model.Card;
import reactor.core.publisher.Flux;

public interface CardCatalog {

    Flux<Card> getAllCards();
    Flux<Card> matchCards(CardCriteria criteria);
}
