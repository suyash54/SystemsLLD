package DecoratorDesignPattern;


    public class Main{

        public static void main(String[] args){

            BasePizza pizzaObj = new ExtraCheese(new Mushroom(new Margherita()));
            System.out.println("Cost of Extracheese,mushroom Margherita pizza is " + pizzaObj.cost());
        }
    }