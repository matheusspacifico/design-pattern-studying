package com.design.pattern.state.machine;

import com.design.pattern.state.Order;

public class CanceledOrder implements OrderState {
    @Override
    public void approvePayment(Order order) {
        System.out.println("The order is canceled!");
    }

    @Override
    public void dispatchOrder(Order order) {
        System.out.println("The order is canceled!");
    }

    @Override
    public void deliverOrder(Order order) {
        System.out.println("The order is canceled!");
    }

    @Override
    public void cancelOrder(Order order) {
        System.out.println("The order is already canceled!");
    }

    public String toString() {
        return "Order canceled.";
    }
}
