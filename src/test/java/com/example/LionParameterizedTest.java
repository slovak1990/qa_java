package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

@RunWith(Parameterized.class)
public class LionParameterizedTest {

    private final String sexLion;
    private final boolean expectedHasMane;

    public LionParameterizedTest(String sexLion, boolean expectedHasMane) {
        this.sexLion = sexLion;
        this.expectedHasMane = expectedHasMane;
    }

    @Parameterized.Parameters
    public static Object[] maneParameters() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false},
        };
    }

    @Test
    public void testWithParameters() throws Exception {
        Lion lion = new Lion(sexLion, mock(Feline.class));
        boolean actual = lion.doesHaveMane();
        assertEquals(expectedHasMane, actual);
    }



}