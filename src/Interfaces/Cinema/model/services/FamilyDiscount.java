package Interfaces.Cinema.model.services;

import Interfaces.Cinema.model.entities.Order;

public class FamilyDiscount implements DiscountStrategy{
    private static final double DISCOUNT_RATE = 0.05;
    private static final int MIN_PEOPLE = 3;

    @Override
    public Double applyDiscount(Order order, double currentTotal) {
        if (order.getEntrances().size() >= MIN_PEOPLE) {
            return currentTotal * (1 - DISCOUNT_RATE);
        }

        return currentTotal;
    }
}
