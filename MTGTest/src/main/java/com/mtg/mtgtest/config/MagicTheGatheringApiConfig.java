package com.mtg.mtgtest.config;

import static com.fasterxml.jackson.databind.DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES;

import com.mtg.mtgtest.card.catalog.model.Card;
import com.mtg.mtgtest.card.client.CardsClient;
import com.mtg.mtgtest.card.client.model.RawCard;
import com.mtg.mtgtest.card.client.mtgio.MagicTheGatheringCardsClient;
import com.mtg.mtgtest.card.client.util.BodyParser;
import com.mtg.mtgtest.card.catalog.CardCatalog;
import com.mtg.mtgtest.card.catalog.mapper.RawCardToCardMapper;
import com.mtg.mtgtest.card.catalog.mtgio.MagicTheGatheringCardCatalog;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.concurrent.ConcurrentMapCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.core.convert.converter.Converter;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
@EnableCaching
@RestController
public class MagicTheGatheringApiConfig {

  @Bean
  public WebClient webClient() {
    return WebClient.builder().build();
  }

  @Bean
  @Scope("prototype")
  public ObjectMapper objectMapper() {
    return new ObjectMapper()
        .configure(FAIL_ON_UNKNOWN_PROPERTIES, false)
        .findAndRegisterModules();
  }

  @Bean
  public BodyParser jsonDeserializer(ObjectMapper objectMapper) {
    return new BodyParser(objectMapper);
  }

  @Bean(name = "cardPagesCacheManager")
  public CacheManager cardPagesCacheManager() {
    return new ConcurrentMapCacheManager("cardPages");
  }

  @Bean
  public Converter<RawCard, Card> rawCardToCardMapper() {
    return new RawCardToCardMapper();
  }

  @Bean
  public CardsClient cardsClient(@Value("${api.mtgio.cards.uri}") String baseUri, BodyParser bodyParser, WebClient webClient) {
    return new MagicTheGatheringCardsClient(baseUri, webClient, bodyParser);
  }

  @Bean
  public CardCatalog cardCatalog(CardsClient cardsClient, Converter<RawCard, Card> mapper) {
    return new MagicTheGatheringCardCatalog(cardsClient, (RawCardToCardMapper) mapper);
  }
}
