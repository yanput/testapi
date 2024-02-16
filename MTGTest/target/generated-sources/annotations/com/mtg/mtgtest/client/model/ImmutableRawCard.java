package com.mtg.mtgtest.client.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.mtg.mtgtest.card.client.model.RawCard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import javax.annotation.processing.Generated;

/**
 * Immutable implementation of {@link RawCard}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableRawCard.builder()}.
 */
@SuppressWarnings({"all"})
@Generated("org.immutables.processor.ProxyProcessor")
public final class ImmutableRawCard implements RawCard {
  private final String name;
  private final String rarity;
  private final double cmc;
  private final String text;
  private final String manaCost;
  private final Set<String> colorIdentity;
  private final Set<String> colors;
  private final Set<String> types;

  private ImmutableRawCard(
      String name,
      String rarity,
      double cmc,
      String text,
      String manaCost,
      Set<String> colorIdentity,
      Set<String> colors,
      Set<String> types) {
    this.name = name;
    this.rarity = rarity;
    this.cmc = cmc;
    this.text = text;
    this.manaCost = manaCost;
    this.colorIdentity = colorIdentity;
    this.colors = colors;
    this.types = types;
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
   * @return The value of the {@code rarity} attribute
   */
  @JsonProperty("rarity")
  @Override
  public String rarity() {
    return rarity;
  }

  /**
   * @return The value of the {@code cmc} attribute
   */
  @JsonProperty("cmc")
  @Override
  public double cmc() {
    return cmc;
  }

  /**
   * @return The value of the {@code text} attribute
   */
  @JsonProperty("text")
  @Override
  public Optional<String> text() {
    return Optional.ofNullable(text);
  }

  /**
   * @return The value of the {@code manaCost} attribute
   */
  @JsonProperty("manaCost")
  @Override
  public Optional<String> manaCost() {
    return Optional.ofNullable(manaCost);
  }

  /**
   * @return The value of the {@code colorIdentity} attribute
   */
  @JsonProperty("colorIdentity")
  @Override
  public Set<String> colorIdentity() {
    return colorIdentity;
  }

  /**
   * @return The value of the {@code colors} attribute
   */
  @JsonProperty("colors")
  @Override
  public Set<String> colors() {
    return colors;
  }

  /**
   * @return The value of the {@code types} attribute
   */
  @JsonProperty("types")
  @Override
  public Set<String> types() {
    return types;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link RawCard#name() name} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for name
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableRawCard withName(String value) {
    if (this.name.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "name");
    return new ImmutableRawCard(
        newValue,
        this.rarity,
        this.cmc,
        this.text,
        this.manaCost,
        this.colorIdentity,
        this.colors,
        this.types);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link RawCard#rarity() rarity} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for rarity
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableRawCard withRarity(String value) {
    if (this.rarity.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "rarity");
    return new ImmutableRawCard(
        this.name,
        newValue,
        this.cmc,
        this.text,
        this.manaCost,
        this.colorIdentity,
        this.colors,
        this.types);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link RawCard#cmc() cmc} attribute.
   * A value strict bits equality used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for cmc
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableRawCard withCmc(double value) {
    if (Double.doubleToLongBits(this.cmc) == Double.doubleToLongBits(value)) return this;
    return new ImmutableRawCard(
        this.name,
        this.rarity,
        value,
        this.text,
        this.manaCost,
        this.colorIdentity,
        this.colors,
        this.types);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RawCard#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRawCard withText(String value) {
    String newValue = Objects.requireNonNull(value, "text");
    if (Objects.equals(this.text, newValue)) return this;
    return new ImmutableRawCard(
        this.name,
        this.rarity,
        this.cmc,
        newValue,
        this.manaCost,
        this.colorIdentity,
        this.colors,
        this.types);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RawCard#text() text} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRawCard withText(Optional<String> optional) {
    String value = optional.orElse(null);
    if (Objects.equals(this.text, value)) return this;
    return new ImmutableRawCard(
        this.name,
        this.rarity,
        this.cmc,
        value,
        this.manaCost,
        this.colorIdentity,
        this.colors,
        this.types);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RawCard#manaCost() manaCost} attribute.
   * @param value The value for manaCost
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRawCard withManaCost(String value) {
    String newValue = Objects.requireNonNull(value, "manaCost");
    if (Objects.equals(this.manaCost, newValue)) return this;
    return new ImmutableRawCard(
        this.name,
        this.rarity,
        this.cmc,
        this.text,
        newValue,
        this.colorIdentity,
        this.colors,
        this.types);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RawCard#manaCost() manaCost} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for manaCost
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRawCard withManaCost(Optional<String> optional) {
    String value = optional.orElse(null);
    if (Objects.equals(this.manaCost, value)) return this;
    return new ImmutableRawCard(this.name, this.rarity, this.cmc, this.text, value, this.colorIdentity, this.colors, this.types);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link RawCard#colorIdentity() colorIdentity}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRawCard withColorIdentity(String... elements) {
    Set<String> newValue = createUnmodifiableSet(createSafeList(Arrays.asList(elements), true, false));
    return new ImmutableRawCard(this.name, this.rarity, this.cmc, this.text, this.manaCost, newValue, this.colors, this.types);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link RawCard#colorIdentity() colorIdentity}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of colorIdentity elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRawCard withColorIdentity(Iterable<String> elements) {
    if (this.colorIdentity == elements) return this;
    Set<String> newValue = createUnmodifiableSet(createSafeList(elements, true, false));
    return new ImmutableRawCard(this.name, this.rarity, this.cmc, this.text, this.manaCost, newValue, this.colors, this.types);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link RawCard#colors() colors}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRawCard withColors(String... elements) {
    Set<String> newValue = createUnmodifiableSet(createSafeList(Arrays.asList(elements), true, false));
    return new ImmutableRawCard(
        this.name,
        this.rarity,
        this.cmc,
        this.text,
        this.manaCost,
        this.colorIdentity,
        newValue,
        this.types);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link RawCard#colors() colors}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of colors elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRawCard withColors(Iterable<String> elements) {
    if (this.colors == elements) return this;
    Set<String> newValue = createUnmodifiableSet(createSafeList(elements, true, false));
    return new ImmutableRawCard(
        this.name,
        this.rarity,
        this.cmc,
        this.text,
        this.manaCost,
        this.colorIdentity,
        newValue,
        this.types);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link RawCard#types() types}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRawCard withTypes(String... elements) {
    Set<String> newValue = createUnmodifiableSet(createSafeList(Arrays.asList(elements), true, false));
    return new ImmutableRawCard(
        this.name,
        this.rarity,
        this.cmc,
        this.text,
        this.manaCost,
        this.colorIdentity,
        this.colors,
        newValue);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link RawCard#types() types}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of types elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRawCard withTypes(Iterable<String> elements) {
    if (this.types == elements) return this;
    Set<String> newValue = createUnmodifiableSet(createSafeList(elements, true, false));
    return new ImmutableRawCard(
        this.name,
        this.rarity,
        this.cmc,
        this.text,
        this.manaCost,
        this.colorIdentity,
        this.colors,
        newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableRawCard} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableRawCard
        && equalTo((ImmutableRawCard) another);
  }

  private boolean equalTo(ImmutableRawCard another) {
    return name.equals(another.name)
        && rarity.equals(another.rarity)
        && Double.doubleToLongBits(cmc) == Double.doubleToLongBits(another.cmc)
        && Objects.equals(text, another.text)
        && Objects.equals(manaCost, another.manaCost)
        && colorIdentity.equals(another.colorIdentity)
        && colors.equals(another.colors)
        && types.equals(another.types);
  }

  /**
   * Computes a hash code from attributes: {@code name}, {@code rarity}, {@code cmc}, {@code text}, {@code manaCost}, {@code colorIdentity}, {@code colors}, {@code types}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + name.hashCode();
    h += (h << 5) + rarity.hashCode();
    h += (h << 5) + Double.hashCode(cmc);
    h += (h << 5) + Objects.hashCode(text);
    h += (h << 5) + Objects.hashCode(manaCost);
    h += (h << 5) + colorIdentity.hashCode();
    h += (h << 5) + colors.hashCode();
    h += (h << 5) + types.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code RawCard} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("RawCard{");
    builder.append("name=").append(name);
    builder.append(", ");
    builder.append("rarity=").append(rarity);
    builder.append(", ");
    builder.append("cmc=").append(cmc);
    if (text != null) {
      builder.append(", ");
      builder.append("text=").append(text);
    }
    if (manaCost != null) {
      builder.append(", ");
      builder.append("manaCost=").append(manaCost);
    }
    builder.append(", ");
    builder.append("colorIdentity=").append(colorIdentity);
    builder.append(", ");
    builder.append("colors=").append(colors);
    builder.append(", ");
    builder.append("types=").append(types);
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements RawCard {
    String name;
    String rarity;
    double cmc;
    boolean cmcIsSet;
    Optional<String> text = Optional.empty();
    Optional<String> manaCost = Optional.empty();
    Set<String> colorIdentity = Collections.emptySet();
    Set<String> colors = Collections.emptySet();
    Set<String> types = Collections.emptySet();
    @JsonProperty("name")
    public void setName(String name) {
      this.name = name;
    }
    @JsonProperty("rarity")
    public void setRarity(String rarity) {
      this.rarity = rarity;
    }
    @JsonProperty("cmc")
    public void setCmc(double cmc) {
      this.cmc = cmc;
      this.cmcIsSet = true;
    }
    @JsonProperty("text")
    public void setText(Optional<String> text) {
      this.text = text;
    }
    @JsonProperty("manaCost")
    public void setManaCost(Optional<String> manaCost) {
      this.manaCost = manaCost;
    }
    @JsonProperty("colorIdentity")
    public void setColorIdentity(Set<String> colorIdentity) {
      this.colorIdentity = colorIdentity;
    }
    @JsonProperty("colors")
    public void setColors(Set<String> colors) {
      this.colors = colors;
    }
    @JsonProperty("types")
    public void setTypes(Set<String> types) {
      this.types = types;
    }
    @Override
    public String name() { throw new UnsupportedOperationException(); }
    @Override
    public String rarity() { throw new UnsupportedOperationException(); }
    @Override
    public double cmc() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> text() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> manaCost() { throw new UnsupportedOperationException(); }
    @Override
    public Set<String> colorIdentity() { throw new UnsupportedOperationException(); }
    @Override
    public Set<String> colors() { throw new UnsupportedOperationException(); }
    @Override
    public Set<String> types() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableRawCard fromJson(Json json) {
    ImmutableRawCard.Builder builder = ImmutableRawCard.builder();
    if (json.name != null) {
      builder.name(json.name);
    }
    if (json.rarity != null) {
      builder.rarity(json.rarity);
    }
    if (json.cmcIsSet) {
      builder.cmc(json.cmc);
    }
    if (json.text != null) {
      builder.text(json.text);
    }
    if (json.manaCost != null) {
      builder.manaCost(json.manaCost);
    }
    if (json.colorIdentity != null) {
      builder.addAllColorIdentity(json.colorIdentity);
    }
    if (json.colors != null) {
      builder.addAllColors(json.colors);
    }
    if (json.types != null) {
      builder.addAllTypes(json.types);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link RawCard} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable RawCard instance
   */
  public static ImmutableRawCard copyOf(RawCard instance) {
    if (instance instanceof ImmutableRawCard) {
      return (ImmutableRawCard) instance;
    }
    return ImmutableRawCard.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableRawCard ImmutableRawCard}.
   * @return A new ImmutableRawCard builder
   */
  public static ImmutableRawCard.Builder builder() {
    return new ImmutableRawCard.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableRawCard ImmutableRawCard}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_NAME = 0x1L;
    private static final long INIT_BIT_RARITY = 0x2L;
    private static final long INIT_BIT_CMC = 0x4L;
    private long initBits = 0x7L;

    private String name;
    private String rarity;
    private double cmc;
    private String text;
    private String manaCost;
    private List<String> colorIdentity = new ArrayList<String>();
    private List<String> colors = new ArrayList<String>();
    private List<String> types = new ArrayList<String>();

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code RawCard} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * Collection elements and entries will be added, not replaced.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(RawCard instance) {
      Objects.requireNonNull(instance, "instance");
      name(instance.name());
      rarity(instance.rarity());
      cmc(instance.cmc());
      Optional<String> textOptional = instance.text();
      if (textOptional.isPresent()) {
        text(textOptional);
      }
      Optional<String> manaCostOptional = instance.manaCost();
      if (manaCostOptional.isPresent()) {
        manaCost(manaCostOptional);
      }
      addAllColorIdentity(instance.colorIdentity());
      addAllColors(instance.colors());
      addAllTypes(instance.types());
      return this;
    }

    /**
     * Initializes the value for the {@link RawCard#name() name} attribute.
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
     * Initializes the value for the {@link RawCard#rarity() rarity} attribute.
     * @param rarity The value for rarity
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("rarity")
    public final Builder rarity(String rarity) {
      this.rarity = Objects.requireNonNull(rarity, "rarity");
      initBits &= ~INIT_BIT_RARITY;
      return this;
    }

    /**
     * Initializes the value for the {@link RawCard#cmc() cmc} attribute.
     * @param cmc The value for cmc
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("cmc")
    public final Builder cmc(double cmc) {
      this.cmc = cmc;
      initBits &= ~INIT_BIT_CMC;
      return this;
    }

    /**
     * Initializes the optional value {@link RawCard#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    public final Builder text(String text) {
      this.text = Objects.requireNonNull(text, "text");
      return this;
    }

    /**
     * Initializes the optional value {@link RawCard#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("text")
    public final Builder text(Optional<String> text) {
      this.text = text.orElse(null);
      return this;
    }

    /**
     * Initializes the optional value {@link RawCard#manaCost() manaCost} to manaCost.
     * @param manaCost The value for manaCost
     * @return {@code this} builder for chained invocation
     */
    public final Builder manaCost(String manaCost) {
      this.manaCost = Objects.requireNonNull(manaCost, "manaCost");
      return this;
    }

    /**
     * Initializes the optional value {@link RawCard#manaCost() manaCost} to manaCost.
     * @param manaCost The value for manaCost
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("manaCost")
    public final Builder manaCost(Optional<String> manaCost) {
      this.manaCost = manaCost.orElse(null);
      return this;
    }

    /**
     * Adds one element to {@link RawCard#colorIdentity() colorIdentity} set.
     * @param element A colorIdentity element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addColorIdentity(String element) {
      this.colorIdentity.add(Objects.requireNonNull(element, "colorIdentity element"));
      return this;
    }

    /**
     * Adds elements to {@link RawCard#colorIdentity() colorIdentity} set.
     * @param elements An array of colorIdentity elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addColorIdentity(String... elements) {
      for (String element : elements) {
        this.colorIdentity.add(Objects.requireNonNull(element, "colorIdentity element"));
      }
      return this;
    }


    /**
     * Sets or replaces all elements for {@link RawCard#colorIdentity() colorIdentity} set.
     * @param elements An iterable of colorIdentity elements
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("colorIdentity")
    public final Builder colorIdentity(Iterable<String> elements) {
      this.colorIdentity.clear();
      return addAllColorIdentity(elements);
    }

    /**
     * Adds elements to {@link RawCard#colorIdentity() colorIdentity} set.
     * @param elements An iterable of colorIdentity elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllColorIdentity(Iterable<String> elements) {
      for (String element : elements) {
        this.colorIdentity.add(Objects.requireNonNull(element, "colorIdentity element"));
      }
      return this;
    }

    /**
     * Adds one element to {@link RawCard#colors() colors} set.
     * @param element A colors element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addColors(String element) {
      this.colors.add(Objects.requireNonNull(element, "colors element"));
      return this;
    }

    /**
     * Adds elements to {@link RawCard#colors() colors} set.
     * @param elements An array of colors elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addColors(String... elements) {
      for (String element : elements) {
        this.colors.add(Objects.requireNonNull(element, "colors element"));
      }
      return this;
    }


    /**
     * Sets or replaces all elements for {@link RawCard#colors() colors} set.
     * @param elements An iterable of colors elements
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("colors")
    public final Builder colors(Iterable<String> elements) {
      this.colors.clear();
      return addAllColors(elements);
    }

    /**
     * Adds elements to {@link RawCard#colors() colors} set.
     * @param elements An iterable of colors elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllColors(Iterable<String> elements) {
      for (String element : elements) {
        this.colors.add(Objects.requireNonNull(element, "colors element"));
      }
      return this;
    }

    /**
     * Adds one element to {@link RawCard#types() types} set.
     * @param element A types element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addTypes(String element) {
      this.types.add(Objects.requireNonNull(element, "types element"));
      return this;
    }

    /**
     * Adds elements to {@link RawCard#types() types} set.
     * @param elements An array of types elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addTypes(String... elements) {
      for (String element : elements) {
        this.types.add(Objects.requireNonNull(element, "types element"));
      }
      return this;
    }


    /**
     * Sets or replaces all elements for {@link RawCard#types() types} set.
     * @param elements An iterable of types elements
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("types")
    public final Builder types(Iterable<String> elements) {
      this.types.clear();
      return addAllTypes(elements);
    }

    /**
     * Adds elements to {@link RawCard#types() types} set.
     * @param elements An iterable of types elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllTypes(Iterable<String> elements) {
      for (String element : elements) {
        this.types.add(Objects.requireNonNull(element, "types element"));
      }
      return this;
    }

    /**
     * Builds a new {@link ImmutableRawCard ImmutableRawCard}.
     * @return An immutable instance of RawCard
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableRawCard build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableRawCard(
          name,
          rarity,
          cmc,
          text,
          manaCost,
          createUnmodifiableSet(colorIdentity),
          createUnmodifiableSet(colors),
          createUnmodifiableSet(types));
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if ((initBits & INIT_BIT_NAME) != 0) attributes.add("name");
      if ((initBits & INIT_BIT_RARITY) != 0) attributes.add("rarity");
      if ((initBits & INIT_BIT_CMC) != 0) attributes.add("cmc");
      return "Cannot build RawCard, some of required attributes are not set " + attributes;
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

  /** Unmodifiable set constructed from list to avoid rehashing. */
  private static <T> Set<T> createUnmodifiableSet(List<T> list) {
    switch(list.size()) {
    case 0: return Collections.emptySet();
    case 1: return Collections.singleton(list.get(0));
    default:
      Set<T> set = new LinkedHashSet<>(list.size());
      set.addAll(list);
      return Collections.unmodifiableSet(set);
    }
  }
}
