package Lesson_09;
import java.util.List;

public interface MarketBehavior {

    void acceptToMarket(Actor actor);

    void realeaseFromMarket(List<Actor> actorList);

    void update();
    
    
}
