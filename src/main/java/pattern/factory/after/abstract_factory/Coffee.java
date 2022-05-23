package pattern.factory.after.abstract_factory;

/**
 * 咖啡类
 */
public abstract class Coffee {

    public abstract String getName();

    public void addMilk(){
        System.out.println("加奶");
    }


    public void addSugar(){
        System.out.println("加糖");
    }


}
