package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;
import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {

    @Mock
    private Feline feline;

    @InjectMocks
    private Cat cat;

    @Test
    public void testGetSound() {
        String expected = "Мяу";

        String actual = cat.getSound();

        assertEquals(expected, actual);
    }

    @Test
    public void testGetFood() throws Exception {
        List<String> expected = List.of("Свинина", "Баранина");
        when(feline.eatMeat()).thenReturn(expected);

        List<String> actual = cat.getFood();

        assertEquals(expected, actual);
    }

}