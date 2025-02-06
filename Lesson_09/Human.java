package Lesson_09;
public class Human extends Actor {
    public Human(String name) {
        super(name);
    }

    @Override
    public void setMakeOrder(boolean makeOrder) {
        super.isMakeOrder = makeOrder;
    }

    @Override
    public void setTakeOrder(boolean takeOrder) {
        super.isTakeOrder = isTakeOrder;
    }

    @Override
    public boolean isMakeOrder() {
        return super.isTakeOrder;
    }

    @Override
    public boolean isTakeOrder() {
        return false;
    }

    @Override
    public String getName() {
        return super.name;
    }
}
