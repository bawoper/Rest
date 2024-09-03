package ru.netology.services;

public class Money {
    public int calculate(int income, int expense, int threshold) {
        int money = 10000;
        int month = 0;

        for (int i = 0; i < 12; i++) {
            if (money >= threshold) {
                money = money - expense;
                money = money / 3;
                month++;

            } else {
                money = money + income;
                money = money - expense;
            }


        }
        return month;


    }


}