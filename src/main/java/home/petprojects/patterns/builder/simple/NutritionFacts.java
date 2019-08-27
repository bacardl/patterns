package java.home.petprojects.patterns.builder.simple;

// builder
public class NutritionFacts {

    private final int servingSize;
    private final int servings;

    private final int calories;

    private final int fat;
    private final int sodium;
    private final int carbohydate;

    public NutritionFacts(Builder builder) {
        servingSize = builder.servingSize;
        servings = builder.servings;
        calories = builder.calories;
        fat = builder.fat;
        sodium = builder.sodium;
        carbohydate = builder.carbohydate;
    }

    public int getServingSize() {
        return servingSize;
    }

    public int getServings() {
        return servings;
    }

    public int getCalories() {
        return calories;
    }

    public int getFat() {
        return fat;
    }

    public int getSodium() {
        return sodium;
    }

    public int getCarbohydate() {
        return carbohydate;
    }

    public static class Builder {

        private final int servingSize;
        private final int servings;

        private int calories = 0;
        private int fat = 0;
        private int sodium = 0;
        private int carbohydate = 0;

        public Builder(int servingSize, int servings) {
            this.servingSize = servingSize;
            this.servings = servings;
        }

        public Builder calories(int val) {
            calories = val;
            return this;
        }

        public Builder fat(int val) {
            fat = val;
            return this;
        }

        public Builder sodium(int val) {
            sodium = val;
            return this;
        }

        public Builder carbohydate(int val) {
            carbohydate = val;
            return this;
        }

        public NutritionFacts build() {
            return new NutritionFacts(this);
        }

    }
}
