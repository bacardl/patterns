package home.petprojects.patterns.builder.hierarchyWithNew;

public class Shape {
    private final double opacity;

    public double getOpacity() {
        return opacity;
    }

    protected static abstract class Init<T extends Init<T>> {
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

    public static class Builder extends Init<Builder> {
        @Override
        protected Builder self() {
            return this;
        }
    }

    protected Shape(Init<?> init) {
        this.opacity = init.opacity;
    }
}
