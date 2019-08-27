package home.petprojects.patterns.builder.hierarchy;

import org.junit.Test;

import java.util.EnumSet;

import static org.junit.Assert.*;

public class PizzaTest {
    @Test
    public void hierarchyPatternBuilderTest() {
        // NyPizza
        NyPizza nyPizza = new NyPizza.Builder(NyPizza.Size.SMALL)
                .addTopping(Pizza.Topping.SAUSAGE).addTopping(Pizza.Topping.ONION).build();

        assertNotNull(nyPizza);
        assertEquals(NyPizza.Size.SMALL, nyPizza.getSize());

        EnumSet<Pizza.Topping> nyToppings = EnumSet.noneOf(Pizza.Topping.class);
        nyToppings.add(Pizza.Topping.SAUSAGE);
        nyToppings.add(Pizza.Topping.ONION);

        assertArrayEquals(nyToppings.toArray(), nyPizza.getToppings().toArray());

        // Calzone
        Calzone calzonePizza= new Calzone.Builder()
                .addTopping(Pizza.Topping.HAM).sauceInside().build();

        assertNotNull(calzonePizza);
        assertTrue(calzonePizza.isSauceInside());

        EnumSet<Pizza.Topping> calzoneToppings = EnumSet.noneOf(Pizza.Topping.class);
        calzoneToppings.add(Pizza.Topping.HAM);

        assertArrayEquals(calzoneToppings.toArray(), calzonePizza.getToppings().toArray());
    }


}