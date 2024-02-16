package com.mtg.mtgtest.card.client.mtgio;
import static org.assertj.core.api.Assertions.assertThat;
import com.mtg.mtgtest.card.client.CardsClient;
import com.mtg.mtgtest.card.client.model.Page;
import com.mtg.mtgtest.config.MagicTheGatheringApiConfig;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import reactor.core.publisher.Mono;
import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

@ExtendWith(SpringExtension.class)
@SpringBootTest(classes = MagicTheGatheringApiConfig.class)
final class MagicTheGatheringCardsClientIntegrationTest {

  private final CardsClient cardsClient;

  @Autowired
  MagicTheGatheringCardsClientIntegrationTest(CardsClient cardsClient) {
    this.cardsClient = cardsClient;
  }

  @Test
  void getLastPageNumber() {
    assertThat(cardsClient.getLastPageNumber().block()).isEqualTo(cardsClient.getPage(1).block().lastPageNumber());
  }

  @Test
  void printCardsOnFirstPage() {
    printCardsOnPage(cardsClient.getPage(1));
  }

  @Test
  void printCardsOnSecondPage() {
    printCardsOnPage(cardsClient.getPage(2));
  }

  @Test
  void printCardsOnLastPage() {
    printCardsOnPage(cardsClient.getPage(cardsClient.getLastPageNumber().block()));
  }

  private static void printCardsOnPage(Mono<Page> page) {
    page.block().cards().forEach(System.out::println);
  }
}
