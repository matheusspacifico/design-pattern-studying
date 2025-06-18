package com.design.pattern.state;

import com.design.pattern.state.machine.AwaitingPaymentState;
import com.design.pattern.state.machine.OrderState;

public class Order {
    private OrderState state;

    public Order() {
        this.state = new AwaitingPaymentState();
    }

    public void setState(OrderState state) {
        this.state = state;
        System.out.println("Order state changed to: " + state.toString());
    }

    public void approvePayment() {
        state.approvePayment(this);
    }

    public void dispatchOrder() {
        state.dispatchOrder(this);
    }

    public void deliverOrder() {
        state.deliverOrder(this);
    }

    public void cancelOrder() {
        state.cancelOrder(this);
    }

    public String getState() {
        return state.toString();
    }
}
