package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoneyTest {

    @Test
    public void testMoney1(){

        Money service = new Money();
        int actual = service.calculate(10000, 3000, 20000);
        int expected = 3;
        Assertions.assertEquals(expected, actual);



    }
    @Test
    public void testMoney2(){

        Money service = new Money();
        int actual = service.calculate(100000, 60000, 150000);
        int expected = 2;
        Assertions.assertEquals(expected, actual);



    }

}

