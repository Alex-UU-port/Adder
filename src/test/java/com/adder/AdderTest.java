package com.adder;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AdderTest {
    @Test
    void testAdd() {

        //Arrange (подготовка)
        int a = 2;
        int b = 3;

        //Act (действие)
        int res1 = Adder.add(a, b);
        int res2 = Adder.add(2, -1);
        int res3 = Adder.add(-1, -5);

        //Assert (проверка)
        assertEquals(5, res1, "Опа па!");
        assertEquals(1, res2, "Опа па!");
        assertEquals(-6, res3, "Опа па!");
    }
}
