package pattern.factory.after.factory_method03;

/**
 * 如果这时候新增一种咖啡就需要改代码,去掉了CoffeeStore与Coffee的耦合，但是新增了SimpleCoffeeFactory与Coffee的耦合，
 * 违反了软件设计的开闭原则
 */

public class CoffeeStore {


    private CoffeeFactory factory;

    public CoffeeStore(CoffeeFactory factory){
        this.factory = factory;
    }

    public Coffee orderCoffee(){

        Coffee coffee = factory.createCoffee();

        coffee.addMilk();
        coffee.addSugar();

        return coffee;
    }

}
