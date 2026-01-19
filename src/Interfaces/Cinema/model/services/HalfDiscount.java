package Interfaces.Cinema.model.services;

import Interfaces.Cinema.model.entities.Order;
import Interfaces.Cinema.model.enums.EntranceType;

public class HalfDiscount implements DiscountStrategy{

    @Override
    public Double applyDiscount(Order order, double currentTotal) {
        double totalDiscount = order.getEntrances().stream()
                .filter(e -> e.getEntranceType() == EntranceType.HALF)
                .mapToDouble(e -> e.getBaseValue() * 0.5)
                .sum();

        return currentTotal - totalDiscount;
    }
}
