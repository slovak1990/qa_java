package com.example;

import org.junit.Test;
import java.util.List;
import static org.junit.Assert.*;

public class FelineTest {

    private final Feline feline = new Feline();


    @Test
    public void testEatMeat() throws Exception {
        List<String> expected = List.of("Животные", "Птицы", "Рыба");

        List<String> actual = feline.eatMeat();

        assertEquals(expected, actual);
    }

    @Test
    public void testGetFamily() {
        String expected = "Кошачьи";

        String actual = feline.getFamily();

        assertEquals(expected, actual);
    }

    @Test
    public void testGetKittensDefault() {
        int expected = 1;

        int actual = feline.getKittens();

        assertEquals(expected, actual);
    }

    @Test
    public void testGetKittens() {
        int expected = 2;

        int actual = feline.getKittens(2);

        assertEquals(expected, actual);
    }
}