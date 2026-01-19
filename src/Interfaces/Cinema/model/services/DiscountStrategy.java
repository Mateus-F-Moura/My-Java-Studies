package Interfaces.Cinema.model.services;

import Interfaces.Cinema.model.entities.Order;

public interface DiscountStrategy {
    Double applyDiscount(Order order, double currentTotal);
}
