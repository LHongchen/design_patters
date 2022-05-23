package pattern.factory.before;

/**
 * 如果这时候新增一种咖啡就需要改代码,违反了软件设计的开闭原则
 */

public class CoffeeStore {

    public Coffee orderCoffee(String type){
        Coffee coffee = null;
        if("american".equals(type)){
            coffee = new AmericanCoffee();
        }else if("latte".equals(type)){
            coffee = new LatteCoffee();
        }else{
            throw new RuntimeException("没有这种咖啡");
        }

        coffee.addMilk();
        coffee.addSugar();

        return coffee;
    }

}
