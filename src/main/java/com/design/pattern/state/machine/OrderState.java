package com.design.pattern.state.machine;

import com.design.pattern.state.Order;

public interface OrderState {
    void approvePayment(Order order);

    void dispatchOrder(Order order);

    void deliverOrder(Order order);

    void cancelOrder(Order order);
}
