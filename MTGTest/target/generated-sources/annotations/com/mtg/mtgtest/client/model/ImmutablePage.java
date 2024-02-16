package com.mtg.mtgtest.client.model;

import com.mtg.mtgtest.card.client.model.Page;
import com.mtg.mtgtest.card.client.model.RawCard;
import com.mtg.mtgtest.catalog.ImmutableCardCriteria;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.processing.Generated;

/**
 * Immutable implementation of {@link Page}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutablePage.builder()}.
 */
@SuppressWarnings({"all"})
@Generated("org.immutables.processor.ProxyProcessor")
public final class ImmutablePage implements Page {
  private final List<RawCard> cards;
  private final Integer nextPageNumber;
  private final Integer lastPageNumber;

  private ImmutablePage(List<RawCard> cards, Integer nextPageNumber, Integer lastPageNumber) {
    this.cards = cards;
    this.nextPageNumber = nextPageNumber;
    this.lastPageNumber = lastPageNumber;
  }

  /**
   * @return The value of the {@code cards} attribute
   */
  @Override
  public List<RawCard> cards() {
    return cards;
  }

  /**
   * @return The value of the {@code nextPageNumber} attribute
   */
  @Override
  public Optional<Integer> nextPageNumber() {
    return Optional.ofNullable(nextPageNumber);
  }

  /**
   * @return The value of the {@code lastPageNumber} attribute
   */
  @Override
  public Integer lastPageNumber() {
    return lastPageNumber;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Page#cards() cards} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for cards
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePage withCards(List<RawCard> value) {
    if (this.cards == value) return this;
    List<RawCard> newValue = Objects.requireNonNull(value, "cards");
    return new ImmutablePage(newValue, this.nextPageNumber, this.lastPageNumber);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Page#nextPageNumber() nextPageNumber} attribute.
   * @param value The value for nextPageNumber
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePage withNextPageNumber(int value) {
    Integer newValue = value;
    if (Objects.equals(this.nextPageNumber, newValue)) return this;
    return new ImmutablePage(this.cards, newValue, this.lastPageNumber);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Page#nextPageNumber() nextPageNumber} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for nextPageNumber
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePage withNextPageNumber(Optional<Integer> optional) {
    Integer value = optional.orElse(null);
    if (Objects.equals(this.nextPageNumber, value)) return this;
    return new ImmutablePage(this.cards, value, this.lastPageNumber);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Page#lastPageNumber() lastPageNumber} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for lastPageNumber
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePage withLastPageNumber(Integer value) {
    if (this.lastPageNumber.equals(value)) return this;
    Integer newValue = Objects.requireNonNull(value, "lastPageNumber");
    return new ImmutablePage(this.cards, this.nextPageNumber, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutablePage} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutablePage
        && equalTo((ImmutablePage) another);
  }

  private boolean equalTo(ImmutablePage another) {
    return cards.equals(another.cards)
        && Objects.equals(nextPageNumber, another.nextPageNumber)
        && lastPageNumber.equals(another.lastPageNumber);
  }

  /**
   * Computes a hash code from attributes: {@code cards}, {@code nextPageNumber}, {@code lastPageNumber}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + cards.hashCode();
    h += (h << 5) + Objects.hashCode(nextPageNumber);
    h += (h << 5) + lastPageNumber.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code Page} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("Page{");
    builder.append("cards=").append(cards);
    if (nextPageNumber != null) {
      builder.append(", ");
      builder.append("nextPageNumber=").append(nextPageNumber);
    }
    builder.append(", ");
    builder.append("lastPageNumber=").append(lastPageNumber);
    return builder.append("}").toString();
  }

  /**
   * Creates an immutable copy of a {@link Page} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Page instance
   */
  public static ImmutablePage copyOf(Page instance) {
    if (instance instanceof ImmutablePage) {
      return (ImmutablePage) instance;
    }
    return ImmutablePage.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutablePage ImmutablePage}.
   * @return A new ImmutablePage builder
   */
  public static ImmutablePage.Builder builder() {
    return new ImmutablePage.Builder();
  }

  /**
   * Builds instances of type {@link ImmutablePage ImmutablePage}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_CARDS = 0x1L;
    private static final long INIT_BIT_LAST_PAGE_NUMBER = 0x2L;
    private long initBits = 0x3L;

    private List<RawCard> cards;
    private Integer nextPageNumber;
    private Integer lastPageNumber;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code Page} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(Page instance) {
      Objects.requireNonNull(instance, "instance");
      cards(instance.cards());
      Optional<Integer> nextPageNumberOptional = instance.nextPageNumber();
      if (nextPageNumberOptional.isPresent()) {
        nextPageNumber(nextPageNumberOptional);
      }
      lastPageNumber(instance.lastPageNumber());
      return this;
    }

    /**
     * Initializes the value for the {@link Page#cards() cards} attribute.
     * @param cards The value for cards
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder cards(List<RawCard> cards) {
      this.cards = Objects.requireNonNull(cards, "cards");
      initBits &= ~INIT_BIT_CARDS;
      return this;
    }

    /**
     * Initializes the optional value {@link Page#nextPageNumber() nextPageNumber} to nextPageNumber.
     * @param nextPageNumber The value for nextPageNumber
     * @return {@code this} builder for chained invocation
     */
    public final Builder nextPageNumber(int nextPageNumber) {
      this.nextPageNumber = nextPageNumber;
      return this;
    }

    /**
     * Initializes the optional value {@link Page#nextPageNumber() nextPageNumber} to nextPageNumber.
     * @param nextPageNumber The value for nextPageNumber
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder nextPageNumber(Optional<Integer> nextPageNumber) {
      this.nextPageNumber = nextPageNumber.orElse(null);
      return this;
    }

    /**
     * Initializes the value for the {@link Page#lastPageNumber() lastPageNumber} attribute.
     * @param lastPageNumber The value for lastPageNumber
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder lastPageNumber(Integer lastPageNumber) {
      this.lastPageNumber = Objects.requireNonNull(lastPageNumber, "lastPageNumber");
      initBits &= ~INIT_BIT_LAST_PAGE_NUMBER;
      return this;
    }

    /**
     * Builds a new {@link ImmutablePage ImmutablePage}.
     * @return An immutable instance of Page
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutablePage build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutablePage(cards, nextPageNumber, lastPageNumber);
    }

    private String formatRequiredAttributesMessage() {
      java.util.List<String> attributes = new ArrayList<>();
      if ((initBits & INIT_BIT_CARDS) != 0) attributes.add("cards");
      if ((initBits & INIT_BIT_LAST_PAGE_NUMBER) != 0) attributes.add("lastPageNumber");
      return "Cannot build Page, some of required attributes are not set " + attributes;
    }

    public UriComponentsBuilder cards(List<RawCard> cards) {
    }

      public ImmutableCardCriteria.Builder addCards(RawCard rawFlamewaveInvoker, RawCard rawCanopySpider) {
      }
  }
}
