package home.petprojects.patterns.builder.hierarchyPizza;

import java.util.EnumSet;
import java.util.Objects;
import java.util.Set;

public abstract class Pizza {

    public enum Topping {HAM, MUSHROOM, ONION, PEPPER, SAUSAGE}

    final Set<Topping> toppings;

    public Set<Topping> getToppings() {
        return toppings;
    }

    // generic class with a recursive argument of type
    abstract static class Builder<T extends Builder<T>> {
        EnumSet<Topping> toppings = EnumSet.noneOf(Topping.class);

        public T addTopping(Topping topping) {
            toppings.add(Objects.requireNonNull(topping));
            return self();
        }

        abstract Pizza build();

        protected abstract T self();
    }

    public Pizza(Builder<?> builder) {
        this.toppings = builder.toppings.clone();
    }
}
