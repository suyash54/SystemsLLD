package DecoratorDesignPattern;

public class Mushroom extends ToppingDecorator{

    BasePizza pizza;

    public Mushroom(BasePizza pizza){
        this.pizza = pizza;
    }

    public int cost(){
        return pizza.cost() + 5;
    }
}