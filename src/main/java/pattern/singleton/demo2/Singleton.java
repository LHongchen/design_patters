package pattern.singleton.demo2;

/**
 * @author liaohongchen
 * @Description 饿汉式 单例模式 静态代码款的方式
 * @date 2022/5/16 22:16
 */
public class Singleton {

    private Singleton(){}

    private static Singleton instance;

    static {
        instance = new Singleton();
    }

    public static Singleton getInstance(){
        return instance;
    }

}
