package com.mtg.mtgtest.card.catalog;

import com.mtg.mtgtest.card.catalog.model.Color;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import javax.annotation.processing.Generated;

/**
 * Immutable implementation of {@link CardCriteria}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableCardCriteria.builder()}.
 */
@SuppressWarnings({"all"})
@Generated("org.immutables.processor.ProxyProcessor")
public final class ImmutableCardCriteria implements CardCriteria {
  private final String nameContains;
  private final Set<Color> colorIdentity;

  private ImmutableCardCriteria(
      String nameContains,
      Set<Color> colorIdentity) {
    this.nameContains = nameContains;
    this.colorIdentity = colorIdentity;
  }

  /**
   * @return The value of the {@code nameContains} attribute
   */
  @Override
  public Optional<String> nameContains() {
    return Optional.ofNullable(nameContains);
  }

  /**
   * @return The value of the {@code colorIdentity} attribute
   */
  @Override
  public Optional<Set<Color>> colorIdentity() {
    return Optional.ofNullable(colorIdentity);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CardCriteria#nameContains() nameContains} attribute.
   * @param value The value for nameContains
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCardCriteria withNameContains(String value) {
    String newValue = Objects.requireNonNull(value, "nameContains");
    if (Objects.equals(this.nameContains, newValue)) return this;
    return new ImmutableCardCriteria(newValue, this.colorIdentity);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CardCriteria#nameContains() nameContains} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for nameContains
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCardCriteria withNameContains(Optional<String> optional) {
    String value = optional.orElse(null);
    if (Objects.equals(this.nameContains, value)) return this;
    return new ImmutableCardCriteria(value, this.colorIdentity);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CardCriteria#colorIdentity() colorIdentity} attribute.
   * @param value The value for colorIdentity
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCardCriteria withColorIdentity(Set<Color> value) {
    Set<Color> newValue = Objects.requireNonNull(value, "colorIdentity");
    if (this.colorIdentity == newValue) return this;
    return new ImmutableCardCriteria(this.nameContains, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CardCriteria#colorIdentity() colorIdentity} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for colorIdentity
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCardCriteria withColorIdentity(Optional<? extends Set<Color>> optional) {
    Set<Color> value = optional.orElse(null);
    if (this.colorIdentity == value) return this;
    return new ImmutableCardCriteria(this.nameContains, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableCardCriteria} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableCardCriteria
        && equalTo((ImmutableCardCriteria) another);
  }

  private boolean equalTo(ImmutableCardCriteria another) {
    return Objects.equals(nameContains, another.nameContains)
        && Objects.equals(colorIdentity, another.colorIdentity);
  }

  /**
   * Computes a hash code from attributes: {@code nameContains}, {@code colorIdentity}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(nameContains);
    h += (h << 5) + Objects.hashCode(colorIdentity);
    return h;
  }

  /**
   * Prints the immutable value {@code CardCriteria} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("CardCriteria{");
    if (nameContains != null) {
      builder.append("nameContains=").append(nameContains);
    }
    if (colorIdentity != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("colorIdentity=").append(colorIdentity);
    }
    return builder.append("}").toString();
  }

  /**
   * Creates an immutable copy of a {@link CardCriteria} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable CardCriteria instance
   */
  public static ImmutableCardCriteria copyOf(CardCriteria instance) {
    if (instance instanceof ImmutableCardCriteria) {
      return (ImmutableCardCriteria) instance;
    }
    return ImmutableCardCriteria.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableCardCriteria ImmutableCardCriteria}.
   * @return A new ImmutableCardCriteria builder
   */
  public static ImmutableCardCriteria.Builder builder() {
    return new ImmutableCardCriteria.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableCardCriteria ImmutableCardCriteria}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private String nameContains;
    private Set<Color> colorIdentity;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code CardCriteria} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(CardCriteria instance) {
      Objects.requireNonNull(instance, "instance");
      Optional<String> nameContainsOptional = instance.nameContains();
      if (nameContainsOptional.isPresent()) {
        nameContains(nameContainsOptional);
      }
      Optional<Set<Color>> colorIdentityOptional = instance.colorIdentity();
      if (colorIdentityOptional.isPresent()) {
        colorIdentity(colorIdentityOptional);
      }
      return this;
    }

    /**
     * Initializes the optional value {@link CardCriteria#nameContains() nameContains} to nameContains.
     * @param nameContains The value for nameContains
     * @return {@code this} builder for chained invocation
     */
    public final Builder nameContains(String nameContains) {
      this.nameContains = Objects.requireNonNull(nameContains, "nameContains");
      return this;
    }

    /**
     * Initializes the optional value {@link CardCriteria#nameContains() nameContains} to nameContains.
     * @param nameContains The value for nameContains
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder nameContains(Optional<String> nameContains) {
      this.nameContains = nameContains.orElse(null);
      return this;
    }

    /**
     * Initializes the optional value {@link CardCriteria#colorIdentity() colorIdentity} to colorIdentity.
     * @param colorIdentity The value for colorIdentity
     * @return {@code this} builder for chained invocation
     */
    public final Builder colorIdentity(Set<Color> colorIdentity) {
      this.colorIdentity = Objects.requireNonNull(colorIdentity, "colorIdentity");
      return this;
    }

    /**
     * Initializes the optional value {@link CardCriteria#colorIdentity() colorIdentity} to colorIdentity.
     * @param colorIdentity The value for colorIdentity
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder colorIdentity(Optional<? extends Set<Color>> colorIdentity) {
      this.colorIdentity = colorIdentity.orElse(null);
      return this;
    }

    /**
     * Builds a new {@link ImmutableCardCriteria ImmutableCardCriteria}.
     * @return An immutable instance of CardCriteria
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableCardCriteria build() {
      return new ImmutableCardCriteria(nameContains, colorIdentity);
    }
  }
}
