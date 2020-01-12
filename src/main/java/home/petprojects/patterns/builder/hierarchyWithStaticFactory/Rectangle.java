package home.petprojects.patterns.builder.hierarchyWithStaticFactory;

public class Rectangle extends Shape {
    private final double height;

    public double getHeight() {
        return height;
    }

    public static abstract class Builder<T extends Builder<T>> extends Shape.Builder<T> {
        private double height;

        public T height(double height) {
            this.height = height;
            return self();
        }

        public Rectangle build() {
            return new Rectangle(this);
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

    protected Rectangle(Builder<?> builder) {
        super(builder);
        this.height = builder.height;
    }
}
