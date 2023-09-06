public interface MarketBehaviour {
    void placeOrder(Order order);
    Order takeOrder();
    boolean hasOrder();
    int sizeQueueOrders();
}
