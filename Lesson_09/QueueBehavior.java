package Lesson_09;
public interface QueueBehavior {

    void takeInQueue(Actor actor);

    void takeOrders();

    void giveOrders();

    void realeaseFromQueue();


}