package pattern.factory.after.abstract_factory;

public class Test {

    public static void main(String[] args) {

        //想要吃美式风味的
//        AmericanDessertFactory factory = new AmericanDessertFactory();
        //想吃意大利风味的
        ItalyDessertFactory factory = new ItalyDessertFactory();
        Coffee coffee = factory.createCoffee();
        Dessert dessert = factory.createDessert();

        System.out.println(coffee.getName());
        dessert.show();


    }
}
