package pattern.singleton.demo5;

/**
 * @author liaohongchen
 * @Description
 * @date 2022/5/18 17:08
 */
public class Client {

    public static void main(String[] args) {

        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();

        System.out.println(instance1 == instance2);

    }
}
