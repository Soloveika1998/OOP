public class Main {
    public static void main(String[] args) {
        Marker marker = new Marker();
        Person client1 = new Person("Katya");
        Person client2 = new Person("Petr");
        Person client3 = new Person("Marina");
        Person client4 = new Person("Maksim");

        marker.enqueue(client1);
        marker.enqueue(client2);
        marker.enqueue(client3);
        marker.enqueue(client4);

        System.out.println("Размер очереди " + marker.sizeQueuePerson() + " клиента(-ов).");
        System.out.println("Первый клиент в очереди " + marker.dequeue());
        System.out.println("Размер очереди " + marker.sizeQueuePerson());

        Order order1 = new Order(1);
        Order order2 = new Order(2);
        Order order3 = new Order(3);

        marker.placeOrder(order1);
        marker.placeOrder(order2);
        marker.placeOrder(order3);

        marker.update();
        marker.update();
        
        System.out.println("Заказов в очереди " + marker.sizeQueueOrders());
        
        marker.update();
        marker.update();
    }
}
