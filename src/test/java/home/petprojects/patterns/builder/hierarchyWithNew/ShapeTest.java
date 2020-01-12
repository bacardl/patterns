package home.petprojects.patterns.builder.hierarchyWithNew;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ShapeTest {
    @Test
    public void shouldCreateColoredRectangle() {
        ColoredRectangle r = new ColoredRectangle.Builder().color("Yellow").opacity(0.5).height(250).build();
        assertEquals("Yellow", r.getColor());
        assertEquals(0.5, r.getOpacity());
        assertEquals(250d, r.getHeight());
    }
}