package pattern.singleton.demo6;

/**
 * @author liaohongchen
 * @Description
 * @date 2022/5/18 17:12
 */
public class Client {

    public static void main(String[] args) {
        Singleton instance1 = Singleton.INSTANCE;
        Singleton instance2 = Singleton.INSTANCE;

        System.out.println(instance1 == instance2);
    }
}
