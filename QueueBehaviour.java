public interface QueueBehaviour {
    
    void enqueue(Person person);
    Person dequeue();
    boolean isEmpty();
    int sizeQueuePerson();
}
