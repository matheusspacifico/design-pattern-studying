package com.design.pattern.state.machine;

import com.design.pattern.state.Order;

public class AwaitingPaymentState implements OrderState {
    @Override
    public void approvePayment(Order order) {
        System.out.println("Payment approved!");
        order.setState(new PaidState());
    }

    @Override
    public void dispatchOrder(Order order) {
        System.out.println("The order is not dispatchable without approved payment!");
    }

    @Override
    public void deliverOrder(Order order) {
        System.out.println("The order is not deliverable without dispatching!");
    }

    @Override
    public void cancelOrder(Order order) {
        System.out.println("Order successfully canceled!");
        order.setState(new CanceledOrder());
    }

    public String toString() {
        return "Awaiting payment...";
    }
}
