package home.petprojects.patterns.builder.hierarchyWithStaticFactory;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.*;

public class ShapeTest {
    @Test
    public void shouldCreateColoredRectangle() {
        ColoredRectangle r = ColoredRectangle.builder().opacity(0.7).height(100).color("White").build();
        assertEquals("White", r.getColor());
        assertEquals(0.7, r.getOpacity());
        assertEquals(100d, r.getHeight());
    }
}