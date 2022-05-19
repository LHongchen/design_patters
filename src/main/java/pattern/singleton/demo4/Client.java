package pattern.singleton.demo4;

/**
 * @author liaohongchen
 * @Description
 * @date 2022/5/16 22:35
 */
public class Client {

    public static void main(String[] args) {

        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();

        System.out.println(instance1 == instance2);

    }
}
