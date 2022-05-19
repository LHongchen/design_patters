package pattern.singleton.demo3;

import java.security.Signature;

/**
 * @author liaohongchen
 * @Description 懒汉式 线程不安全 安全
 * @date 2022/5/16 22:26
 */
public class Singleton {

    private Singleton(){}

    private static Singleton instance;

    //线程不安全
    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }

    //线程安全 性能不好
//    public static synchronized Singleton getInstance(){
//        if(instance == null){
//            instance = new Singleton();
//        }
//        return instance;
//    }

}
