import java.util.Iterator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Marker marker = new Marker();
        Person client1 = new Person("Katya", "Brest", 18, 247407);
        Person client2 = new Person("Petr", "Minsk", 15);
        Person client3 = new Person("Marina", "Vitebsk", 54);
        Person client4 = new Person("Maksim", "Grodno", 33);

        marker.enqueue(client1);
        marker.enqueue(client2);
        marker.enqueue(client3);
        marker.enqueue(client4);

        // System.out.println("Размер очереди " + marker.sizeQueuePerson() + " клиента(-ов).");
        // System.out.println("Первый клиент в очереди " + marker.dequeue());
        // System.out.println("Размер очереди " + marker.sizeQueuePerson());

        Order order1 = new Order(1, 956);
        Order order2 = new Order(2, 745);
        Order order3 = new Order(3, 546);
        
        
        List<Order> orders = new ArrayList<>();
        orders.add(order1);
        orders.add(order2);
        orders.add(order3);

        Collections.sort(orders);
        System.out.println(orders);

        marker.placeOrder(order1);
        marker.placeOrder(order2);
        marker.placeOrder(order3);

        // marker.update();
        // marker.update();
        
        // System.out.println("Заказов в очереди " + marker.sizeQueueOrders());

        // marker.update();
        // marker.update();

        AdultInterface adult = (age) -> {
            if (age >= 18) {
                System.out.println("Клиент совершеннолетний");
                return true;
            }
            else {
                System.out.println("Клиент несовершеннолетний");
                return false;
            }
        };

        System.out.println(adult.getValue(client1.getAge()));
        System.out.println(adult.getValue(client2.getAge()));

        // Iterator<String> data = client1;
        // while (data.hasNext()) {
        //     System.out.println(client1.next());
        // }

        // System.out.println("");

        // Iterator<String> data1 = client2;
        // while (data1.hasNext()) {
        //     System.out.println(client2.next());
        // }

        List<Person> persons = new ArrayList<>();
        persons.add(client1);
        persons.add(client2);
        persons.add(client3);
        persons.add(client4);
        Collections.sort(persons);
        
        

        for (int i = 0; i < persons.size(); i++) {
            Iterator<String> data2 = persons.get(i);
            while (data2.hasNext()) {
                System.out.println(persons.get(i).next());
            }
        }

    }
}
