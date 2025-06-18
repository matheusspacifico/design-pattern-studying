package com.design.pattern.state.machine;

import com.design.pattern.state.Order;

public class DispatchedOrder implements OrderState {
    @Override
    public void approvePayment(Order order) {
        System.out.println("Payment already approved!");
    }

    @Override
    public void dispatchOrder(Order order) {
        System.out.println("Order already dispatched!");
    }

    @Override
    public void deliverOrder(Order order) {
        System.out.println("Delivering order!");
        order.setState(new OnTheWayState());
    }

    @Override
    public void cancelOrder(Order order) {
        System.out.println("Order canceled, refunding payment!");
        order.setState(new CanceledOrder());
    }

    public String toString() {
        return "Order dispatched.";
    }
}
