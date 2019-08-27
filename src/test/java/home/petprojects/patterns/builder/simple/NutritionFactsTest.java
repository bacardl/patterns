package home.petprojects.patterns.builder.simple;

import org.junit.Test;

import static org.junit.Assert.*;

public class NutritionFactsTest {
    @Test
    public void patternBuilderTest() {
        NutritionFacts cocaCola = new NutritionFacts.Builder(240, 8)
                .calories(100).sodium(35).carbohydate(27).build();

        assertNotNull(cocaCola);
        assertEquals(240, cocaCola.getServingSize());
        assertEquals(8, cocaCola.getServings());
        assertEquals(100, cocaCola.getCalories());
        assertEquals(35, cocaCola.getSodium());
        assertEquals(27, cocaCola.getCarbohydate());

    }
}