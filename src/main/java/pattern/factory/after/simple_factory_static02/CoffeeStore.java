package pattern.factory.after.simple_factory_static02;

/**
 * 如果这时候新增一种咖啡就需要改代码,去掉了CoffeeStore与Coffee的耦合，但是新增了SimpleCoffeeFactory与Coffee的耦合，
 * 违反了软件设计的开闭原则
 *
 * 静态调用更方便 静态简单工厂
 */

public class CoffeeStore {

    public Coffee orderCoffee(String type){

//        SimpleCoffeeFactory factory = new SimpleCoffeeFactory();
//        Coffee coffee = factory.createCoffee(type);
        Coffee coffee = SimpleCoffeeFactory.createCoffee(type);

        coffee.addMilk();
        coffee.addSugar();

        return coffee;
    }

}
