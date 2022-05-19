package pattern.singleton.demo4;

/**
 * @author liaohongchen
 * @Description 双检锁
 * @date 2022/5/16 22:33
 */
public class Singleton {

    private Singleton(){}

    private static volatile Singleton instance;

    public static Singleton getInstance(){
        if(instance == null){
            synchronized (Singleton.class){
                if(instance == null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

}
