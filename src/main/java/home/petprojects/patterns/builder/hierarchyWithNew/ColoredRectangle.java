package home.petprojects.patterns.builder.hierarchyWithNew;

public class ColoredRectangle extends Rectangle {
    private final String color;

    public String getColor() {
        return color;
    }

    protected static abstract class Init<T extends Init<T>> extends Rectangle.Init<T> {
        private String color;

        public T color(String color) {
            this.color = color;
            return self();
        }

        public ColoredRectangle build() {
            return new ColoredRectangle(this);
        }
    }

    public static class Builder extends Init<Builder> {
        @Override
        protected ColoredRectangle.Builder self() {
            return this;
        }
    }

    protected ColoredRectangle(Init<?> init) {
        super(init);
        this.color = init.color;
    }
}
