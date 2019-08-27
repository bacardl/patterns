package home.petprojects.patterns.builder.hierarchy;

import org.junit.Test;

import java.util.EnumSet;

import static org.junit.Assert.*;

public class PizzaTest {
    @Test
    public void hierarchyPatternBuilderTest() {
        NyPizza nyPizza = new NyPizza.Builder(NyPizza.Size.SMALL)
                .addTopping(Pizza.Topping.SAUSAGE).addTopping(Pizza.Topping.ONION).build();

        assertNotNull(nyPizza);
        assertEquals(NyPizza.Size.SMALL, nyPizza.getSize());

        EnumSet<Pizza.Topping> toppings = EnumSet.noneOf(Pizza.Topping.class);
        toppings.add(Pizza.Topping.SAUSAGE);
        toppings.add(Pizza.Topping.ONION);

        assertArrayEquals(toppings.toArray(), nyPizza.getToppings().toArray());
}
}