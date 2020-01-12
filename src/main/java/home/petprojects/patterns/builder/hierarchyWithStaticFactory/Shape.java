package home.petprojects.patterns.builder.hierarchyWithStaticFactory;

public class Shape {
    private final double opacity;

    public double getOpacity() {
        return opacity;
    }

    public static abstract class Builder<T extends Builder<T>> {
        private double opacity;

        protected abstract T self();

        public T opacity(double opacity) {
            this.opacity = opacity;
            return self();
        }

        public Shape build() {
            return new Shape(this);
        }
    }

    private static class Builder2 extends Builder<Builder2> {
        @Override
        protected Builder2 self() {
            return this;
        }
    }

    public static Builder<?> builder() {
        return new Builder2();
    }

    protected Shape(Builder<?> builder) {
        this.opacity = builder.opacity;
    }
}
