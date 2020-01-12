package home.petprojects.patterns.builder.hierarchyWithStaticFactory;

public class ColoredRectangle extends Rectangle {
    private final String color;

    public String getColor() {
        return color;
    }

    public static abstract class Builder<T extends Builder<T>> extends Rectangle.Builder<T> {
        private String color;

        public T color(String color) {
            this.color = color;
            return self();
        }

        public ColoredRectangle build() {
            return new ColoredRectangle(this);
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

    protected ColoredRectangle(Builder<?> builder) {
        super(builder);
        this.color = builder.color;
    }
}
