package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;
import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Mock
    private Feline feline;

    @Test
    public void testCountKittens() throws Exception {
        Lion lion = new Lion("Самец", feline);

        int actual = lion.getKittens();

        assertEquals(0, actual);
    }

    @Test
    public void testGetFood() throws Exception {
        Lion lion = new Lion("Самка", feline);

        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        when(feline.getFood("Хищник")).thenReturn(expected);

        List<String> actual = lion.getFood();

        assertEquals(expected, actual);
    }

    @Test
    public void testGetKittens() throws Exception {
        Lion lion = new Lion("Самец", feline);

        int expected = lion.getKittens();

        int actual = 0;

        assertEquals(expected, actual);
    }

    @Test(expected = Exception.class)
    public void testExceptionThrown() throws Exception {
        Lion lion = new Lion("Гермофродит", feline);
    }
}