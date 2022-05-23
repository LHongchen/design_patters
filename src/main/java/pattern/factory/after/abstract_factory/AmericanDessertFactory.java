package pattern.factory.after.abstract_factory;

public class AmericanDessertFactory implements DessertFactory{
    public Coffee createCoffee() {
        return new AmericanCoffee();
    }

    public Dessert createDessert() {
        return new MatchaMousse();
    }
}
