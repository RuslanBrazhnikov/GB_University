package Lesson_09;
import java.util.List;

public class Market implements MarketBehavior, QueueBehavior{

    private List<Actor> queue;

    @Override
    public void takeInQueue(Actor actor) {
        
    }

    @Override
    public void takeOrders() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'takeOrders'");
    }

    @Override
    public void giveOrders() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'giveOrders'");
    }

    @Override
    public void realeaseFromQueue() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'realeaseFromQueue'");
    }

    @Override
    public void acceptToMarket(Actor actor) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'acceptToMarket'");
    }

    @Override
    public void realeaseFromMarket(List<Actor> actorList) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'realeaseFromMarket'");
    }

    @Override
    public void update() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }
    
}
