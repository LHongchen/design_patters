package pattern.singleton.demo8;

import java.lang.reflect.Constructor;

/**
 * @author liaohongchen
 * @Description
 * @date 2022/5/18 17:44
 */
public class Test {

    public static void main(String[] args) throws Exception {

        Class<Singleton> clazz = Singleton.class;

        Constructor<Singleton> constructor = clazz.getDeclaredConstructor();
        //构造器私有，设置访问检查取消才能用
        constructor.setAccessible(true);

        Singleton singleton1 = constructor.newInstance();
        Singleton singleton2 = constructor.newInstance();

        System.out.println(singleton1);
        System.out.println(singleton2);
        System.out.println(singleton1 == singleton2);
    }
}
