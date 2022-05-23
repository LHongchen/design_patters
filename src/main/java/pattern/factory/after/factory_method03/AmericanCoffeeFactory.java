package pattern.factory.after.factory_method03;

/**
 * 美式咖啡工厂
 */
public class AmericanCoffeeFactory implements CoffeeFactory{
    public Coffee createCoffee() {
        return new AmericanCoffee();
    }
}
