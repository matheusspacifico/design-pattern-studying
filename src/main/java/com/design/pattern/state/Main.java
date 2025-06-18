package com.design.pattern.state;

public class Main {
    public static void main(String[] args) {
        Order pedido = new Order();

        System.out.println("--- NOVO PEDIDO ---");
        System.out.println("Estado inicial: " + pedido.getState());

        // Tentativa de ação inválida no estado inicial
        System.out.println("\n-> Tentando despachar o pedido...");
        pedido.dispatchOrder();

        // Transição para o próximo estado
        System.out.println("\n-> Aprovando o pagamento...");
        pedido.approvePayment();

        // Tentativa de ação inválida no estado "Pago"
        System.out.println("\n-> Tentando aprovar o pagamento novamente...");
        pedido.approvePayment();

        // Transição para o próximo estado
        System.out.println("\n-> Despachando o pedido...");
        pedido.dispatchOrder();

        // Transição final
        System.out.println("\n-> Entregando o pedido...");
        pedido.deliverOrder();

        // Tentativa de ação em um estado final
        System.out.println("\n-> Tentando cancelar um pedido já entregue...");
        pedido.cancelOrder();
    }
}
