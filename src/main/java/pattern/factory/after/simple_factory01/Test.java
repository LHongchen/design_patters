package pattern.factory.after.simple_factory01;


public class Test {

    public static void main(String[] args) {

        CoffeeStore store = new CoffeeStore();
//        Coffee coffee = store.orderCoffee("latte");
        Coffee coffee = store.orderCoffee("american");

        System.out.println(coffee.getName());


    }

}
