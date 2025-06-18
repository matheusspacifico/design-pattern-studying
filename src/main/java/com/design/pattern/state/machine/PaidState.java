package com.design.pattern.state.machine;

import com.design.pattern.state.Order;

public class PaidState implements OrderState {
    @Override
    public void approvePayment(Order order) {
        System.out.println("The payment is already approved!");
    }

    @Override
    public void dispatchOrder(Order order) {
        System.out.println("Order dispatched!");
        order.setState(new DispatchedOrder());
    }

    @Override
    public void deliverOrder(Order order) {
        System.out.println("The order needs to be dispatched first!");
    }

    @Override
    public void cancelOrder(Order order) {
        System.out.println("Order canceled, refunding payment!");
        order.setState(new CanceledOrder());
    }

    public String toString() {
        return "Payment approved.";
    }
}
