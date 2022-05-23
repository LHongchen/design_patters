package pattern.factory.after.simple_factory_static02;

public class SimpleCoffeeFactory {


    public static Coffee createCoffee(String type){
        Coffee coffee = null;
        if("american".equals(type)){
            coffee = new AmericanCoffee();
        }else if("latte".equals(type)){
            coffee = new LatteCoffee();
        }else{
            throw new RuntimeException("没有这种咖啡");
        }
        return coffee;
    }

}
