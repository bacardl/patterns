package home.petprojects.patterns.builder.hierarchyWithNew;

public class Rectangle extends Shape {
    private final double height;

    public double getHeight() {
        return height;
    }

    protected static abstract class Init<T extends Init<T>> extends Shape.Init<T> {
        private double height;

        public T height(double height) {
            this.height = height;
            return self();
        }

        public Rectangle build() {
            return new Rectangle(this);
        }
    }

    public static class Builder extends Init<Builder> {
        @Override
        protected Builder self() {
            return this;
        }
    }

    protected Rectangle(Init<?> init) {
        super(init);
        this.height = init.height;
    }
}
