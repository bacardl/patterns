package home.petprojects.patterns.builder.hierarchyPizza;

import java.util.Objects;

public class NyPizza extends Pizza {

    public enum Size {SMALL, MEDIUM, LARGE}

    public Size getSize() {
        return size;
    }

    protected final Size size;

    public static class Builder extends Pizza.Builder<Builder> {
        protected final Size size;

        public Builder(Size size) {
            this.size = Objects.requireNonNull(size);
        }

        @Override
        public NyPizza build() {
            return new NyPizza(this);
        }

        @Override
        protected Builder self() {
            return this;
        }
    }

    public NyPizza(Builder builder) {
        super(builder);
        size = builder.size;
    }
}
