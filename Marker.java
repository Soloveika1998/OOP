import java.time.Period;
import java.util.LinkedList;
import java.util.Queue;


public class Marker implements QueueBehaviour, MarketBehaviour {
    private Queue queue;
    private Queue orders;

    public Marker() {
        queue = new LinkedList();
        orders = new LinkedList();
    }


    //Интерфейс QueueBehaviour
    @Override
    public void enqueue(Person person) {
        queue.add(person);
    }

    @Override
    public Person dequeue() {
        return (Person) queue.poll();
    }

    @Override
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    @Override
    public int sizeQueuePerson() {
        return queue.size();
    }

    //Интерфейс MarketBehaviour
    @Override
    public void placeOrder(Order order) {
        orders.add(order);
    }

    @Override
    public Order takeOrder() {
        return (Order) orders.poll();
    }

    @Override
    public boolean hasOrder() {
        return !orders.isEmpty();
    }

    @Override
    public int sizeQueueOrders() {
        return orders.size();
    }
    
    public void update() {
        if (hasOrder()) {
            Order order = takeOrder();
            System.out.println("Заказ готов: " + order.toString());
        }
        else {
            System.out.println("Заказов нет");
        }
    }
}
