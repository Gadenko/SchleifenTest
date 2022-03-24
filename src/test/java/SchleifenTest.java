import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SchleifenTest {

    @Test
    void testFor() {
        assertEquals(1, Schleifen.testFor(0));
    }

    @Test
    void testWhile() {
        assertEquals(1, Schleifen.testWhile(0));
    }

}