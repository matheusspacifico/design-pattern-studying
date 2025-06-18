package com.design.pattern.state.machine;

import com.design.pattern.state.Order;

public class OnTheWayState implements OrderState {
    @Override
    public void approvePayment(Order order) {
        System.out.println("Payment is already approved!");
    }

    @Override
    public void dispatchOrder(Order order) {
        System.out.println("Order is already on the way!");
    }

    @Override
    public void deliverOrder(Order order) {
        System.out.println("Order is already on the way!");
    }

    @Override
    public void cancelOrder(Order order) {
        System.out.println("Order canceled, refunding payment!");
        order.setState(new CanceledOrder());
    }

    public String toString() {
        return "Order is on the way...";
    }
}
