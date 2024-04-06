package DecoratorDesignPattern;

    public class ExtraCheese extends ToppingDecorator{

            BasePizza pizza;

            public ExtraCheese(BasePizza pizza){
                this.pizza = pizza;
            }

            public int cost(){
                return pizza.cost() + 10;
            }
    }