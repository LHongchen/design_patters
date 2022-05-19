package pattern.singleton.demo2;

import pattern.singleton.demo2.Singleton;

/**
 * @author liaohongchen
 * @Description
 * @date 2022/5/16 22:13
 */
public class Client {

    public static void main(String[] args) {

        Singleton instance1 = Singleton.getInstance();

        Singleton instance2 = Singleton.getInstance();

        System.out.println(instance1 == instance2);

    }
}
