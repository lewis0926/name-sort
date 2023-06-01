package com.namesort;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

class NameTest {

    @Test
    void testCompareTo() {
        Name name1 = new Name("Hunter Uriah Mathew Clarke");
        Name name2 = new Name("Beau Tristan Bentley");
        Name name3 = new Name("Beau Tristan Bentley");

        Assertions.assertEquals(0, name2.compareTo(name3));
        Assertions.assertEquals(1, name1.compareTo(name2));
        Assertions.assertEquals(-1, name2.compareTo(name1));
    }

    @Test
    void testToString() {
        Name name1 = new Name("Hunter Uriah Mathew Clarke");
        Name name2 = new Name("Beau Tristan Bentley");

        Assertions.assertEquals("Hunter Uriah Mathew Clarke", name1.toString());
        Assertions.assertEquals("Beau Tristan Bentley", name2.toString());
    }
}
