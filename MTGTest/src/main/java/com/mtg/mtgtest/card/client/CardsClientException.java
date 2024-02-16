package com.mtg.mtgtest.card.client;

public class CardsClientException extends RuntimeException {

    public CardsClientException(String message, Throwable cause) {
        super(message, cause);
    }

    public CardsClientException(String message) {
        super(message);
    }
}
