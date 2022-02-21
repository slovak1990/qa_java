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
public class AlexLionTest {

    @Mock
    private Feline feline;

    @InjectMocks
    private AlexLion lion;

    @Test
    public void testCountKittens() {
        int actual = lion.getKittens();

        assertEquals(0, actual);
    }

    @Test
    public void testGetFood() throws Exception {
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        when(feline.getFood("Хищник")).thenReturn(expected);

        List<String> actual = lion.getFood();

        assertEquals(expected, actual);
    }

    @Test
    public void testGetKittens() {
        int actual = 0;

        assertEquals(lion.getKittens(), actual);
    }

    @Test
    public void testGetFriends() {
        List<String> expected = List.of("Зебра Марти", "Бегемотиха Глория", "Жираф Мелман");

        List<String> actual = lion.getFriends();

        assertEquals(expected, actual);
    }

    @Test
    public void testGetPlaceOfLiving() {
        String expected = "Нью-Йоркский зоопарк";

        String actual = lion.getPlaceOfLiving();

        assertEquals(expected, actual);
    }


}