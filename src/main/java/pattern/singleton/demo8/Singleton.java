package pattern.singleton.demo8;

import java.io.Serializable;

/**
 * @author liaohongchen
 * @Description 静态内部类的方式、
 * 静态内部类单例模式中实例由内部类创建，由于 JVM 在加载外部类的过程中,
 * 是不会加载静态内部类的, 只有内部类的属性/方法被调用时才会被加载, 并初始化其静态属性。
 * 静态属性由于被 `static` 修饰，保证只被实例化一次，并且严格保证实例化顺序。
 * @date 2022/5/18 17:05
 */
public class Singleton implements Serializable {

    private static boolean flag = false;

    private Singleton(){
        synchronized (Singleton.class){
            if(flag){
                throw new RuntimeException("单例的，不能创建多个对象");
            }
            flag = true;
        }
    }

    private static class SingletonHolder{
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance(){
        return SingletonHolder.INSTANCE;
    }

}
