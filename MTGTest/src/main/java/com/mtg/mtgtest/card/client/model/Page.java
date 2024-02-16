package com.mtg.mtgtest.card.client.model;

import org.immutables.value.Value.Immutable;

import java.util.List;
import java.util.Optional;

@Immutable
public interface Page {

    List<RawCard> cards();
    Optional<Integer> nextPageNumber();
    Integer lastPageNumber();
}
