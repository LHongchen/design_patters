package pattern.factory.after.factory_method03;


public class Test {

    public static void main(String[] args) {

//        CoffeeStore store = new CoffeeStore(new AmericanCoffeeFactory() );
        CoffeeStore store = new CoffeeStore(new LatteCoffeeFactory() );
        Coffee coffee = store.orderCoffee();

        System.out.println(coffee.getName());


    }

}
