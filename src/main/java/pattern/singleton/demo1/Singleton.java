package pattern.singleton.demo1;

/**
 * @author liaohongchen
 * @Description 饿汉式 单例模式 静态成员变量
 * @date 2022/5/16 22:12
 */
public class Singleton {

    private Singleton() {
    }

    private static Singleton instance = new Singleton();

    public static Singleton getInstance(){
        return instance;
    }
}
