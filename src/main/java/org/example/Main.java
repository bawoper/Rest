package org.example;

import ru.netology.services.Money;

public class Main {
    public static void main(String[] args) {

        Money service = new Money();


        int mounth = service.calculate(10000, 3000, 20000);

        System.out.println("Отдыхать_" + mounth + "_месяца");


    }


}