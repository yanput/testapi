package com.mtg.mtgtest.card.catalog.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import javax.annotation.processing.Generated;

/**
 * Immutable implementation of {@link Card}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableCard.builder()}.
 */
@SuppressWarnings({"all"})
@Generated("org.immutables.processor.ProxyProcessor")
public final class ImmutableCard implements Card {
  private final String name;
  private final Set<Color> colorIdentity;
  private final int convertedManaCost;

  private ImmutableCard(
      String name,
      Set<Color> colorIdentity,
      int convertedManaCost) {
    this.name = name;
    this.colorIdentity = colorIdentity;
    this.convertedManaCost = convertedManaCost;
  }

  /**
   * @return The value of the {@code name} attribute
   */
  @JsonProperty("name")
  @Override
  public String name() {
    return name;
  }

  /**
   * @return The value of the {@code colorIdentity} attribute
   */
  @JsonProperty("colorIdentity")
  @Override
  public Set<Color> colorIdentity() {
    return colorIdentity;
  }

  /**
   * @return The value of the {@code convertedManaCost} attribute
   */
  @JsonProperty("convertedManaCost")
  @Override
  public int convertedManaCost() {
    return convertedManaCost;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Card#name() name} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for name
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableCard withName(String value) {
    if (this.name.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "name");
    return new ImmutableCard(newValue, this.colorIdentity, this.convertedManaCost);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link Card#colorIdentity() colorIdentity}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCard withColorIdentity(Color... elements) {
    Set<Color> newValue = createUnmodifiableEnumSet(Arrays.asList(elements));
    return new ImmutableCard(this.name, newValue, this.convertedManaCost);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link Card#colorIdentity() colorIdentity}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of colorIdentity elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCard withColorIdentity(Iterable<Color> elements) {
    if (this.colorIdentity == elements) return this;
    Set<Color> newValue = createUnmodifiableEnumSet(elements);
    return new ImmutableCard(this.name, newValue, this.convertedManaCost);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Card#convertedManaCost() convertedManaCost} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for convertedManaCost
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableCard withConvertedManaCost(int value) {
    if (this.convertedManaCost == value) return this;
    return new ImmutableCard(this.name, this.colorIdentity, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableCard} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableCard
        && equalTo((ImmutableCard) another);
  }

  private boolean equalTo(ImmutableCard another) {
    return name.equals(another.name)
        && colorIdentity.equals(another.colorIdentity)
        && convertedManaCost == another.convertedManaCost;
  }

  /**
   * Computes a hash code from attributes: {@code name}, {@code colorIdentity}, {@code convertedManaCost}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + name.hashCode();
    h += (h << 5) + colorIdentity.hashCode();
    h += (h << 5) + convertedManaCost;
    return h;
  }

  /**
   * Prints the immutable value {@code Card} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "Card{"
        + "name=" + name
        + ", colorIdentity=" + colorIdentity
        + ", convertedManaCost=" + convertedManaCost
        + "}";
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements Card {
    String name;
    Set<Color> colorIdentity = Collections.emptySet();
    int convertedManaCost;
    boolean convertedManaCostIsSet;
    @JsonProperty("name")
    public void setName(String name) {
      this.name = name;
    }
    @JsonProperty("colorIdentity")
    public void setColorIdentity(Set<Color> colorIdentity) {
      this.colorIdentity = colorIdentity;
    }
    @JsonProperty("convertedManaCost")
    public void setConvertedManaCost(int convertedManaCost) {
      this.convertedManaCost = convertedManaCost;
      this.convertedManaCostIsSet = true;
    }
    @Override
    public String name() { throw new UnsupportedOperationException(); }
    @Override
    public Set<Color> colorIdentity() { throw new UnsupportedOperationException(); }
    @Override
    public int convertedManaCost() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableCard fromJson(Json json) {
    ImmutableCard.Builder builder = ImmutableCard.builder();
    if (json.name != null) {
      builder.name(json.name);
    }
    if (json.colorIdentity != null) {
      builder.addAllColorIdentity(json.colorIdentity);
    }
    if (json.convertedManaCostIsSet) {
      builder.convertedManaCost(json.convertedManaCost);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Card} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Card instance
   */
  public static ImmutableCard copyOf(Card instance) {
    if (instance instanceof ImmutableCard) {
      return (ImmutableCard) instance;
    }
    return ImmutableCard.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableCard ImmutableCard}.
   * @return A new ImmutableCard builder
   */
  public static ImmutableCard.Builder builder() {
    return new ImmutableCard.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableCard ImmutableCard}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_NAME = 0x1L;
    private static final long INIT_BIT_CONVERTED_MANA_COST = 0x2L;
    private long initBits = 0x3L;

    private String name;
    private EnumSet<Color> colorIdentity = EnumSet.noneOf(Color.class);
    private int convertedManaCost;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code Card} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * Collection elements and entries will be added, not replaced.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(Card instance) {
      Objects.requireNonNull(instance, "instance");
      name(instance.name());
      addAllColorIdentity(instance.colorIdentity());
      convertedManaCost(instance.convertedManaCost());
      return this;
    }

    /**
     * Initializes the value for the {@link Card#name() name} attribute.
     * @param name The value for name 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("name")
    public final Builder name(String name) {
      this.name = Objects.requireNonNull(name, "name");
      initBits &= ~INIT_BIT_NAME;
      return this;
    }

    /**
     * Adds one element to {@link Card#colorIdentity() colorIdentity} set.
     * @param element A colorIdentity element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addColorIdentity(Color element) {
      this.colorIdentity.add(Objects.requireNonNull(element, "colorIdentity element"));
      return this;
    }

    /**
     * Adds elements to {@link Card#colorIdentity() colorIdentity} set.
     * @param elements An array of colorIdentity elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addColorIdentity(Color... elements) {
      for (Color element : elements) {
        this.colorIdentity.add(Objects.requireNonNull(element, "colorIdentity element"));
      }
      return this;
    }


    /**
     * Sets or replaces all elements for {@link Card#colorIdentity() colorIdentity} set.
     * @param elements An iterable of colorIdentity elements
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("colorIdentity")
    public final Builder colorIdentity(Iterable<Color> elements) {
      this.colorIdentity.clear();
      return addAllColorIdentity(elements);
    }

    /**
     * Adds elements to {@link Card#colorIdentity() colorIdentity} set.
     * @param elements An iterable of colorIdentity elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllColorIdentity(Iterable<Color> elements) {
      for (Color element : elements) {
        this.colorIdentity.add(Objects.requireNonNull(element, "colorIdentity element"));
      }
      return this;
    }

    /**
     * Initializes the value for the {@link Card#convertedManaCost() convertedManaCost} attribute.
     * @param convertedManaCost The value for convertedManaCost 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("convertedManaCost")
    public final Builder convertedManaCost(int convertedManaCost) {
      this.convertedManaCost = convertedManaCost;
      initBits &= ~INIT_BIT_CONVERTED_MANA_COST;
      return this;
    }

    /**
     * Builds a new {@link ImmutableCard ImmutableCard}.
     * @return An immutable instance of Card
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableCard build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableCard(name, createUnmodifiableEnumSet(colorIdentity), convertedManaCost);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if ((initBits & INIT_BIT_NAME) != 0) attributes.add("name");
      if ((initBits & INIT_BIT_CONVERTED_MANA_COST) != 0) attributes.add("convertedManaCost");
      return "Cannot build Card, some of required attributes are not set " + attributes;
    }
  }

  private static <T> List<T> createSafeList(Iterable<? extends T> iterable, boolean checkNulls, boolean skipNulls) {
    ArrayList<T> list;
    if (iterable instanceof Collection<?>) {
      int size = ((Collection<?>) iterable).size();
      if (size == 0) return Collections.emptyList();
      list = new ArrayList<>();
    } else {
      list = new ArrayList<>();
    }
    for (T element : iterable) {
      if (skipNulls && element == null) continue;
      if (checkNulls) Objects.requireNonNull(element, "element");
      list.add(element);
    }
    return list;
  }

  @SuppressWarnings("unchecked")
  private static <T extends Enum<T>> Set<T> createUnmodifiableEnumSet(Iterable<T> iterable) {
    if (iterable instanceof EnumSet<?>) {
      return Collections.unmodifiableSet(EnumSet.copyOf((EnumSet<T>) iterable));
    }
    List<T> list = createSafeList(iterable, true, false);
    switch(list.size()) {
    case 0: return Collections.emptySet();
    case 1: return Collections.singleton(list.get(0));
    default: return Collections.unmodifiableSet(EnumSet.copyOf(list));
    }
  }
}
